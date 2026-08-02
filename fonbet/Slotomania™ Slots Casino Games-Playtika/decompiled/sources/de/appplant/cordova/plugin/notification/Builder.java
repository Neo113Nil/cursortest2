package de.appplant.cordova.plugin.notification;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.media.app.NotificationCompat;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import de.appplant.cordova.plugin.notification.action.Action;
import de.appplant.cordova.plugin.notification.receiver.NotificationClickActivity;
import java.util.List;
import java.util.Random;

/* loaded from: classes7.dex */
public final class Builder {
    private Class<?> clearReceiver;
    private Class<?> clickActivity;
    private final Context context;
    private Bundle extras;
    private final Options options;
    private final Random random = new Random();

    public Builder(Options options) {
        this.context = options.getContext();
        this.options = options;
    }

    public Builder setClearReceiver(Class<?> cls) {
        this.clearReceiver = cls;
        return this;
    }

    public Builder setClickActivity(Class<?> cls) {
        this.clickActivity = cls;
        return this;
    }

    public Builder setExtras(Bundle bundle) {
        this.extras = bundle;
        return this;
    }

    public Notification build() {
        if (this.options.isSilent()) {
            return new Notification(this.context, this.options);
        }
        Uri sound = this.options.getSound();
        Bundle bundle = new Bundle();
        bundle.putInt(Notification.EXTRA_ID, this.options.getId().intValue());
        bundle.putString("NOTIFICATION_SOUND", sound.toString());
        NotificationCompat.Builder lights = findOrCreateBuilder().setDefaults(this.options.getDefaults()).setExtras(bundle).setOnlyAlertOnce(false).setChannelId(this.options.getChannel()).setContentTitle(this.options.getTitle()).setContentText(this.options.getText()).setTicker(this.options.getText()).setNumber(this.options.getNumber()).setAutoCancel(this.options.isAutoClear().booleanValue()).setOngoing(this.options.isSticky().booleanValue()).setColor(this.options.getColor()).setVisibility(this.options.getVisibility()).setPriority(this.options.getPrio()).setShowWhen(this.options.showClock()).setUsesChronometer(this.options.showChronometer()).setGroup(this.options.getGroup()).setGroupSummary(this.options.getGroupSummary()).setTimeoutAfter(this.options.getTimeout()).setLights(this.options.getLedColor(), this.options.getLedOn(), this.options.getLedOff());
        if (this.options.isCustomLayout().booleanValue()) {
            Resources resources = this.context.getResources();
            String packageName = this.context.getPackageName();
            int identifier = resources.getIdentifier("title", "id", packageName);
            int identifier2 = resources.getIdentifier("message", "id", packageName);
            int identifier3 = resources.getIdentifier("app_icon", "id", packageName);
            int identifier4 = resources.getIdentifier("background", "id", packageName);
            int identifier5 = resources.getIdentifier("collapsed_local_notification", TtmlNode.TAG_LAYOUT, packageName);
            int identifier6 = resources.getIdentifier("expanded_local_notification", TtmlNode.TAG_LAYOUT, packageName);
            RemoteViews remoteViews = new RemoteViews(packageName, identifier5);
            remoteViews.setTextViewText(identifier, this.options.getTitle());
            remoteViews.setTextViewText(identifier2, this.options.getText());
            RemoteViews remoteViews2 = new RemoteViews(packageName, identifier6);
            remoteViews2.setTextViewText(identifier, this.options.getTitle());
            remoteViews2.setTextViewText(identifier2, this.options.getText());
            if (this.options.hasLargeIcon()) {
                Bitmap largeIcon = this.options.getLargeIcon();
                remoteViews.setImageViewBitmap(identifier3, largeIcon);
                remoteViews2.setImageViewBitmap(identifier3, largeIcon);
            }
            if (this.options.hasBackground()) {
                Bitmap background = this.options.getBackground();
                remoteViews.setImageViewBitmap(identifier4, background);
                remoteViews2.setImageViewBitmap(identifier4, background);
            }
            lights.setContent(remoteViews);
            lights.setCustomContentView(remoteViews);
            lights.setCustomBigContentView(remoteViews2);
        }
        if (!sound.equals(Uri.EMPTY) && !isUpdate()) {
            lights.setSound(sound);
        }
        if (this.options.isWithoutSound()) {
            lights.setSound(null);
        }
        if (this.options.isWithProgressBar()) {
            lights.setProgress(this.options.getProgressMaxValue(), this.options.getProgressValue(), this.options.isIndeterminateProgress());
        }
        if (this.options.hasLargeIcon() && !this.options.isCustomLayout().booleanValue()) {
            lights.setSmallIcon(this.options.getSmallIcon());
            Bitmap largeIcon2 = this.options.getLargeIcon();
            if (this.options.getLargeIconType().equals(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE)) {
                largeIcon2 = getCircleBitmap(largeIcon2);
            }
            lights.setLargeIcon(largeIcon2);
        } else {
            lights.setSmallIcon(this.options.getSmallIcon());
        }
        if (this.options.useFullScreenIntent()) {
            applyFullScreenIntent(lights);
        }
        if (!this.options.isCustomLayout().booleanValue()) {
            applyStyle(lights);
        }
        applyActions(lights);
        applyDeleteReceiver(lights);
        applyContentReceiver(lights);
        return new Notification(this.context, this.options, lights);
    }

    void applyFullScreenIntent(NotificationCompat.Builder builder) {
        PendingIntent activity;
        Intent putExtra = this.context.getPackageManager().getLaunchIntentForPackage(this.context.getPackageName()).putExtra("launchNotificationId", this.options.getId());
        int nextInt = this.random.nextInt();
        if (Build.VERSION.SDK_INT >= 31) {
            activity = PendingIntent.getActivity(this.context, nextInt, putExtra, 201326592);
        } else {
            activity = PendingIntent.getActivity(this.context, nextInt, putExtra, C.BUFFER_FLAG_FIRST_SAMPLE);
        }
        builder.setFullScreenIntent(activity, true);
    }

    private Bitmap getCircleBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        new RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(SupportMenu.CATEGORY_MASK);
        float width = bitmap.getWidth() / 2;
        float height = bitmap.getHeight() / 2;
        canvas.drawCircle(width, height, width < height ? width : height, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        bitmap.recycle();
        return createBitmap;
    }

    private void applyStyle(NotificationCompat.Builder builder) {
        NotificationCompat.MessagingStyle.Message[] messages = this.options.getMessages();
        String summary = this.options.getSummary();
        if (messages != null) {
            applyMessagingStyle(builder, messages);
            return;
        }
        MediaSessionCompat.Token mediaSessionToken = this.options.getMediaSessionToken();
        if (mediaSessionToken != null) {
            applyMediaStyle(builder, mediaSessionToken);
            return;
        }
        List<Bitmap> attachments = this.options.getAttachments();
        if (attachments.size() > 0) {
            applyBigPictureStyle(builder, attachments);
            return;
        }
        String text = this.options.getText();
        if (text != null && text.contains("\n")) {
            applyInboxStyle(builder);
        } else if (text != null) {
            if (summary != null || text.length() >= 45) {
                applyBigTextStyle(builder);
            }
        }
    }

    private void applyMessagingStyle(NotificationCompat.Builder builder, NotificationCompat.MessagingStyle.Message[] messageArr) {
        NotificationCompat.MessagingStyle conversationTitle = new NotificationCompat.MessagingStyle("Me").setConversationTitle(this.options.getTitle());
        for (NotificationCompat.MessagingStyle.Message message : messageArr) {
            conversationTitle.addMessage(message);
        }
        builder.setStyle(conversationTitle);
    }

    private void applyBigPictureStyle(NotificationCompat.Builder builder, List<Bitmap> list) {
        String summary = this.options.getSummary();
        String text = this.options.getText();
        NotificationCompat.BigPictureStyle bigPictureStyle = new NotificationCompat.BigPictureStyle(builder);
        if (summary == null) {
            summary = text;
        }
        builder.setStyle(bigPictureStyle.setSummaryText(summary).bigPicture(list.get(0)));
    }

    private void applyInboxStyle(NotificationCompat.Builder builder) {
        String text = this.options.getText();
        NotificationCompat.InboxStyle summaryText = new NotificationCompat.InboxStyle(builder).setSummaryText(this.options.getSummary());
        for (String str : text.split("\n")) {
            summaryText.addLine(str);
        }
        builder.setStyle(summaryText);
    }

    private void applyBigTextStyle(NotificationCompat.Builder builder) {
        builder.setStyle(new NotificationCompat.BigTextStyle(builder).setSummaryText(this.options.getSummary()).bigText(this.options.getText()));
    }

    private void applyMediaStyle(NotificationCompat.Builder builder, MediaSessionCompat.Token token) {
        builder.setStyle(new NotificationCompat.MediaStyle(builder).setMediaSession(token).setShowActionsInCompactView(1));
    }

    private void applyDeleteReceiver(NotificationCompat.Builder builder) {
        PendingIntent broadcast;
        if (this.clearReceiver == null) {
            return;
        }
        Intent putExtra = new Intent(this.context, this.clearReceiver).setAction(this.options.getIdentifier()).putExtra(Notification.EXTRA_ID, this.options.getId());
        Bundle bundle = this.extras;
        if (bundle != null) {
            putExtra.putExtras(bundle);
        }
        int nextInt = this.random.nextInt();
        if (Build.VERSION.SDK_INT >= 31) {
            broadcast = PendingIntent.getBroadcast(this.context, nextInt, putExtra, 201326592);
        } else {
            broadcast = PendingIntent.getBroadcast(this.context, nextInt, putExtra, C.BUFFER_FLAG_FIRST_SAMPLE);
        }
        builder.setDeleteIntent(broadcast);
    }

    private Class<?> getClickReceiver() {
        if (Build.VERSION.SDK_INT >= 31) {
            return NotificationClickActivity.class;
        }
        return this.clickActivity;
    }

    private void applyContentReceiver(NotificationCompat.Builder builder) {
        PendingIntent service;
        if (Build.VERSION.SDK_INT >= 31 || this.clickActivity != null) {
            Intent flags = new Intent(this.context, getClickReceiver()).putExtra(Notification.EXTRA_ID, this.options.getId()).putExtra(Action.EXTRA_ID, "click").putExtra(Options.EXTRA_LAUNCH, this.options.isLaunchingApp()).setFlags(1073741824);
            Bundle bundle = this.extras;
            if (bundle != null) {
                flags.putExtras(bundle);
            }
            int nextInt = this.random.nextInt();
            if (Build.VERSION.SDK_INT >= 31) {
                service = PendingIntent.getActivity(this.context, nextInt, flags, 201326592);
            } else {
                service = PendingIntent.getService(this.context, nextInt, flags, C.BUFFER_FLAG_FIRST_SAMPLE);
            }
            builder.setContentIntent(service);
        }
    }

    private void applyActions(NotificationCompat.Builder builder) {
        Action[] actions = this.options.getActions();
        if (actions == null || actions.length == 0) {
            return;
        }
        for (Action action : actions) {
            NotificationCompat.Action.Builder builder2 = new NotificationCompat.Action.Builder(action.getIcon(), action.getTitle(), getPendingIntentForAction(action));
            if (action.isWithInput()) {
                builder2.addRemoteInput(action.getInput());
            }
            builder.addAction(builder2.build());
        }
    }

    private PendingIntent getPendingIntentForAction(Action action) {
        Intent flags = new Intent(this.context, getClickReceiver()).putExtra(Notification.EXTRA_ID, this.options.getId()).putExtra(Action.EXTRA_ID, action.getId()).putExtra(Options.EXTRA_LAUNCH, action.isLaunchingApp()).setFlags(1073741824);
        Bundle bundle = this.extras;
        if (bundle != null) {
            flags.putExtras(bundle);
        }
        int nextInt = this.random.nextInt();
        if (Build.VERSION.SDK_INT >= 31) {
            return PendingIntent.getActivity(this.context, nextInt, flags, 201326592);
        }
        return PendingIntent.getService(this.context, nextInt, flags, C.BUFFER_FLAG_FIRST_SAMPLE);
    }

    private boolean isUpdate() {
        Bundle bundle = this.extras;
        return bundle != null && bundle.getBoolean(Notification.EXTRA_UPDATE, false);
    }

    private NotificationCompat.Builder findOrCreateBuilder() {
        NotificationCompat.Builder cachedBuilder = Notification.getCachedBuilder(this.options.getId().intValue());
        return cachedBuilder == null ? new NotificationCompat.Builder(this.context, this.options.getChannel()) : cachedBuilder;
    }
}
