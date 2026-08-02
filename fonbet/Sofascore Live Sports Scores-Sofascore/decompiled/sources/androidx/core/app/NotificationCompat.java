package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Annotation;
import android.text.ParcelableSpan;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.sofascore.results.R;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.a70;
import defpackage.aa;
import defpackage.bfd;
import defpackage.c90;
import defpackage.cfd;
import defpackage.dfd;
import defpackage.eq3;
import defpackage.n9e;
import defpackage.nfe;
import defpackage.nib;
import defpackage.pea;
import defpackage.sxf;
import defpackage.ued;
import defpackage.ved;
import defpackage.wed;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class NotificationCompat {
    private static final String ANNOTATION_SEMANTIC_STYLE_KEY = "android.app.notification.semanticStyle";
    public static final int BADGE_ICON_LARGE = 2;
    public static final int BADGE_ICON_NONE = 0;
    public static final int BADGE_ICON_SMALL = 1;
    public static final String CATEGORY_ALARM = "alarm";
    public static final String CATEGORY_CALL = "call";
    public static final String CATEGORY_EMAIL = "email";
    public static final String CATEGORY_ERROR = "err";
    public static final String CATEGORY_EVENT = "event";
    public static final String CATEGORY_LOCATION_SHARING = "location_sharing";
    public static final String CATEGORY_MESSAGE = "msg";
    public static final String CATEGORY_MISSED_CALL = "missed_call";
    public static final String CATEGORY_NAVIGATION = "navigation";
    public static final String CATEGORY_PROGRESS = "progress";
    public static final String CATEGORY_PROMO = "promo";
    public static final String CATEGORY_RECOMMENDATION = "recommendation";
    public static final String CATEGORY_REMINDER = "reminder";
    public static final String CATEGORY_SERVICE = "service";
    public static final String CATEGORY_SOCIAL = "social";
    public static final String CATEGORY_STATUS = "status";
    public static final String CATEGORY_STOPWATCH = "stopwatch";
    public static final String CATEGORY_SYSTEM = "sys";
    public static final String CATEGORY_TRANSPORT = "transport";
    public static final String CATEGORY_VOICEMAIL = "voicemail";
    public static final String CATEGORY_WORKOUT = "workout";
    public static final int COLOR_DEFAULT = 0;
    public static final int DEFAULT_ALL = -1;
    public static final int DEFAULT_LIGHTS = 4;
    public static final int DEFAULT_SOUND = 1;
    public static final int DEFAULT_VIBRATE = 2;
    public static final String EXTRA_ANSWER_COLOR = "android.answerColor";
    public static final String EXTRA_ANSWER_INTENT = "android.answerIntent";
    public static final String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";
    public static final String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";
    public static final String EXTRA_BIG_TEXT = "android.bigText";
    public static final String EXTRA_CALL_IS_VIDEO = "android.callIsVideo";
    public static final String EXTRA_CALL_PERSON = "android.callPerson";
    public static final String EXTRA_CALL_PERSON_COMPAT = "android.callPersonCompat";
    public static final String EXTRA_CALL_TYPE = "android.callType";
    public static final String EXTRA_CHANNEL_GROUP_ID = "android.intent.extra.CHANNEL_GROUP_ID";
    public static final String EXTRA_CHANNEL_ID = "android.intent.extra.CHANNEL_ID";
    public static final String EXTRA_CHRONOMETER_COUNT_DOWN = "android.chronometerCountDown";
    public static final String EXTRA_COLORIZED = "android.colorized";
    public static final String EXTRA_COMPACT_ACTIONS = "android.compactActions";
    public static final String EXTRA_COMPAT_TEMPLATE = "androidx.core.app.extra.COMPAT_TEMPLATE";
    public static final String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";
    public static final String EXTRA_DECLINE_COLOR = "android.declineColor";
    public static final String EXTRA_DECLINE_INTENT = "android.declineIntent";
    public static final String EXTRA_HANG_UP_INTENT = "android.hangUpIntent";
    public static final String EXTRA_HIDDEN_CONVERSATION_TITLE = "android.hiddenConversationTitle";
    public static final String EXTRA_HISTORIC_MESSAGES = "android.messages.historic";
    public static final String EXTRA_INFO_TEXT = "android.infoText";
    public static final String EXTRA_IS_GROUP_CONVERSATION = "android.isGroupConversation";
    public static final String EXTRA_LARGE_ICON = "android.largeIcon";
    public static final String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";
    public static final String EXTRA_MEDIA_SESSION = "android.mediaSession";
    public static final String EXTRA_MESSAGES = "android.messages";
    private static final String EXTRA_MESSAGING_PERSON = "android.messagingUser";
    public static final String EXTRA_MESSAGING_STYLE_USER = "android.messagingStyleUser";
    public static final String EXTRA_NOTIFICATION_ID = "android.intent.extra.NOTIFICATION_ID";
    public static final String EXTRA_NOTIFICATION_TAG = "android.intent.extra.NOTIFICATION_TAG";

    @Deprecated
    public static final String EXTRA_PEOPLE = "android.people";
    public static final String EXTRA_PEOPLE_LIST = "android.people.list";
    public static final String EXTRA_PICTURE = "android.picture";
    public static final String EXTRA_PICTURE_CONTENT_DESCRIPTION = "android.pictureContentDescription";
    public static final String EXTRA_PICTURE_ICON = "android.pictureIcon";
    public static final String EXTRA_PREFER_SMALL_ICON = "android.app.preferSmallIcon";
    public static final String EXTRA_PROGRESS = "android.progress";
    public static final String EXTRA_PROGRESS_END_ICON = "android.progressEndIcon";
    public static final String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";
    public static final String EXTRA_PROGRESS_MAX = "android.progressMax";
    public static final String EXTRA_PROGRESS_POINTS = "android.progressPoints";
    public static final String EXTRA_PROGRESS_SEGMENTS = "android.progressSegments";
    public static final String EXTRA_PROGRESS_START_ICON = "android.progressStartIcon";
    public static final String EXTRA_PROGRESS_TRACKER_ICON = "android.progressTrackerIcon";
    public static final String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";
    public static final String EXTRA_REQUEST_PROMOTED_ONGOING = "android.requestPromotedOngoing";
    public static final String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";
    public static final String EXTRA_SHORT_CRITICAL_TEXT = "android.shortCriticalText";
    public static final String EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED = "android.showBigPictureWhenCollapsed";
    public static final String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";
    public static final String EXTRA_SHOW_WHEN = "android.showWhen";
    public static final String EXTRA_SMALL_ICON = "android.icon";
    public static final String EXTRA_STYLED_BY_PROGRESS = "android.styledByProgress";
    public static final String EXTRA_SUB_TEXT = "android.subText";
    public static final String EXTRA_SUMMARY_TEXT = "android.summaryText";
    public static final String EXTRA_TEMPLATE = "android.template";
    public static final String EXTRA_TEXT = "android.text";
    public static final String EXTRA_TEXT_LINES = "android.textLines";
    public static final String EXTRA_TITLE = "android.title";
    public static final String EXTRA_TITLE_BIG = "android.title.big";
    public static final String EXTRA_VERIFICATION_ICON = "android.verificationIcon";
    public static final String EXTRA_VERIFICATION_ICON_COMPAT = "android.verificationIconCompat";
    public static final String EXTRA_VERIFICATION_TEXT = "android.verificationText";
    public static final int FLAG_AUTO_CANCEL = 16;
    public static final int FLAG_BUBBLE = 4096;
    public static final int FLAG_FOREGROUND_SERVICE = 64;
    public static final int FLAG_GROUP_SUMMARY = 512;

    @Deprecated
    public static final int FLAG_HIGH_PRIORITY = 128;
    public static final int FLAG_INSISTENT = 4;
    public static final int FLAG_LOCAL_ONLY = 256;
    public static final int FLAG_NO_CLEAR = 32;
    public static final int FLAG_ONGOING_EVENT = 2;
    public static final int FLAG_ONLY_ALERT_ONCE = 8;
    public static final int FLAG_SHOW_LIGHTS = 1;
    public static final int FOREGROUND_SERVICE_DEFAULT = 0;
    public static final int FOREGROUND_SERVICE_DEFERRED = 2;
    public static final int FOREGROUND_SERVICE_IMMEDIATE = 1;
    public static final int GROUP_ALERT_ALL = 0;
    public static final int GROUP_ALERT_CHILDREN = 2;
    public static final int GROUP_ALERT_SUMMARY = 1;
    public static final String GROUP_KEY_SILENT = "silent";
    public static final String INTENT_CATEGORY_NOTIFICATION_PREFERENCES = "android.intent.category.NOTIFICATION_PREFERENCES";
    public static final int MAX_ACTION_BUTTONS = 3;
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_MAX = 2;
    public static final int PRIORITY_MIN = -2;
    public static final int SEMANTIC_STYLE_CAUTION = 3;
    public static final int SEMANTIC_STYLE_DANGER = 4;
    public static final int SEMANTIC_STYLE_INFO = 1;
    public static final int SEMANTIC_STYLE_SAFE = 2;
    public static final int SEMANTIC_STYLE_UNSPECIFIED = 0;
    public static final int STREAM_DEFAULT = -1;
    private static final String TAG = "NotifCompat";
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_SECRET = -1;

    @Deprecated
    public NotificationCompat() {
    }

    public static ParcelableSpan createSemanticStyleAnnotation(int i) {
        return new Annotation(ANNOTATION_SEMANTIC_STYLE_KEY, String.valueOf(i));
    }

    public static wed getAction(Notification notification, int i) {
        return getActionCompatFromAction(notification.actions[i]);
    }

    public static wed getActionCompatFromAction(Notification.Action action) {
        sxf[] sxfVarArr;
        int i;
        int i2;
        int i3;
        RemoteInput[] remoteInputs = action.getRemoteInputs();
        IconCompat iconCompat = null;
        if (remoteInputs == null) {
            sxfVarArr = null;
        } else {
            sxf[] sxfVarArr2 = new sxf[remoteInputs.length];
            for (int i4 = 0; i4 < remoteInputs.length; i4++) {
                RemoteInput remoteInput = remoteInputs[i4];
                sxfVarArr2[i4] = new sxf(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), Build.VERSION.SDK_INT >= 29 ? eq3.t(remoteInput) : 0, remoteInput.getExtras(), null);
            }
            sxfVarArr = sxfVarArr2;
        }
        boolean z = action.getExtras().getBoolean("android.support.allowGeneratedReplies") || action.getAllowGeneratedReplies();
        boolean z2 = action.getExtras().getBoolean("android.support.action.showsUserInterface", true);
        int i5 = Build.VERSION.SDK_INT;
        int A = i5 >= 28 ? c90.A(action) : action.getExtras().getInt("android.support.action.semanticAction", 0);
        boolean D = i5 >= 29 ? eq3.D(action) : false;
        if (i5 >= 37) {
            i = ved.a(action);
            i2 = ved.b(action);
        } else {
            i = 0;
            i2 = 0;
        }
        boolean a = i5 >= 31 ? ued.a(action) : false;
        if (action.getIcon() == null && (i3 = action.icon) != 0) {
            return new wed(i3, action.title, action.actionIntent, action.getExtras(), sxfVarArr, z, A, z2, D, i, i2, a);
        }
        if (action.getIcon() != null) {
            Icon icon = action.getIcon();
            PorterDuff.Mode mode = IconCompat.k;
            if (n9e.B(icon) != 2 || n9e.z(icon) != 0) {
                iconCompat = n9e.s(icon);
            }
        }
        return new wed(iconCompat, action.title, action.actionIntent, action.getExtras(), sxfVarArr, z, A, z2, D, i, i2, a);
    }

    public static int getActionCount(Notification notification) {
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr.length;
        }
        return 0;
    }

    public static boolean getAllowSystemGeneratedContextualActions(Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return eq3.o(notification);
        }
        return false;
    }

    public static boolean getAutoCancel(Notification notification) {
        return (notification.flags & 16) != 0;
    }

    public static int getBadgeIconType(Notification notification) {
        return notification.getBadgeIconType();
    }

    public static dfd getBubbleMetadata(Notification notification) {
        Notification.BubbleMetadata p;
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || (p = eq3.p(notification)) == null) {
            return null;
        }
        if (i >= 30) {
            return cfd.a(p);
        }
        if (i == 29) {
            return bfd.a(p);
        }
        return null;
    }

    public static String getCategory(Notification notification) {
        return notification.category;
    }

    public static String getChannelId(Notification notification) {
        return notification.getChannelId();
    }

    public static int getColor(Notification notification) {
        return notification.color;
    }

    public static CharSequence getContentInfo(Notification notification) {
        return notification.extras.getCharSequence(EXTRA_INFO_TEXT);
    }

    public static CharSequence getContentText(Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TEXT);
    }

    public static CharSequence getContentTitle(Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TITLE);
    }

    @Deprecated
    public static Bundle getExtras(Notification notification) {
        return notification.extras;
    }

    public static String getGroup(Notification notification) {
        return notification.getGroup();
    }

    public static int getGroupAlertBehavior(Notification notification) {
        return notification.getGroupAlertBehavior();
    }

    public static boolean getHighPriority(Notification notification) {
        return (notification.flags & 128) != 0;
    }

    public static List<wed> getInvisibleActions(Notification notification) {
        Bundle bundle;
        Bundle[] bundleArr;
        Bundle[] bundleArr2;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle2 != null && (bundle = bundle2.getBundle("invisible_actions")) != null) {
            for (int i = 0; i < bundle.size(); i++) {
                Bundle bundle3 = bundle.getBundle(Integer.toString(i));
                Bundle bundle4 = bundle3.getBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS);
                boolean z = bundle4 != null ? bundle4.getBoolean("android.support.allowGeneratedReplies", false) : false;
                int i2 = bundle3.getInt("icon");
                CharSequence charSequence = bundle3.getCharSequence("title");
                PendingIntent pendingIntent = (PendingIntent) bundle3.getParcelable("actionIntent");
                Bundle bundle5 = bundle3.getBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS);
                Parcelable[] parcelableArray = bundle3.getParcelableArray("remoteInputs");
                if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
                    bundleArr = (Bundle[]) parcelableArray;
                } else {
                    bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
                    bundle3.putParcelableArray("remoteInputs", bundleArr);
                }
                sxf[] t = pea.t(bundleArr);
                Parcelable[] parcelableArray2 = bundle3.getParcelableArray("dataOnlyRemoteInputs");
                if ((parcelableArray2 instanceof Bundle[]) || parcelableArray2 == null) {
                    bundleArr2 = (Bundle[]) parcelableArray2;
                } else {
                    bundleArr2 = (Bundle[]) Arrays.copyOf(parcelableArray2, parcelableArray2.length, Bundle[].class);
                    bundle3.putParcelableArray("dataOnlyRemoteInputs", bundleArr2);
                }
                pea.t(bundleArr2);
                arrayList.add(new wed(i2, charSequence, pendingIntent, bundle5, t, z, bundle3.getInt("semanticAction"), bundle3.getBoolean("showsUserInterface"), false, 0, 0, false));
            }
        }
        return arrayList;
    }

    public static boolean getLocalOnly(Notification notification) {
        return (notification.flags & FLAG_LOCAL_ONLY) != 0;
    }

    public static nib getLocusId(Notification notification) {
        LocusId v;
        if (Build.VERSION.SDK_INT >= 29 && (v = eq3.v(notification)) != null) {
            String u = eq3.u(v);
            if (!TextUtils.isEmpty(u)) {
                return new nib(u);
            }
            a70.p("id cannot be empty");
        }
        return null;
    }

    public static Notification[] getNotificationArrayFromBundle(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
            return (Notification[]) parcelableArray;
        }
        Notification[] notificationArr = new Notification[parcelableArray.length];
        for (int i = 0; i < parcelableArray.length; i++) {
            notificationArr[i] = (Notification) parcelableArray[i];
        }
        bundle.putParcelableArray(str, notificationArr);
        return notificationArr;
    }

    public static boolean getOngoing(Notification notification) {
        return (notification.flags & 2) != 0;
    }

    public static boolean getOnlyAlertOnce(Notification notification) {
        return (notification.flags & 8) != 0;
    }

    public static List<nfe> getPeople(Notification notification) {
        IconCompat iconCompat;
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList parcelableArrayList = notification.extras.getParcelableArrayList(EXTRA_PEOPLE_LIST);
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    Person person = (Person) it.next();
                    CharSequence name = person.getName();
                    if (person.getIcon() != null) {
                        Icon icon = person.getIcon();
                        PorterDuff.Mode mode = IconCompat.k;
                        iconCompat = n9e.s(icon);
                    } else {
                        iconCompat = null;
                    }
                    String uri = person.getUri();
                    String key = person.getKey();
                    boolean isBot = person.isBot();
                    boolean isImportant = person.isImportant();
                    nfe nfeVar = new nfe();
                    nfeVar.a = name;
                    nfeVar.b = iconCompat;
                    nfeVar.c = uri;
                    nfeVar.d = key;
                    nfeVar.e = isBot;
                    nfeVar.f = isImportant;
                    arrayList.add(nfeVar);
                }
            }
        } else {
            String[] stringArray = notification.extras.getStringArray(EXTRA_PEOPLE);
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    nfe nfeVar2 = new nfe();
                    nfeVar2.a = null;
                    nfeVar2.b = null;
                    nfeVar2.c = str;
                    nfeVar2.d = null;
                    nfeVar2.e = false;
                    nfeVar2.f = false;
                    arrayList.add(nfeVar2);
                }
            }
        }
        return arrayList;
    }

    public static Notification getPublicVersion(Notification notification) {
        return notification.publicVersion;
    }

    public static CharSequence getSettingsText(Notification notification) {
        return notification.getSettingsText();
    }

    public static String getShortCriticalText(Notification notification) {
        return notification.extras.getString(EXTRA_SHORT_CRITICAL_TEXT);
    }

    public static String getShortcutId(Notification notification) {
        return notification.getShortcutId();
    }

    public static boolean getShowWhen(Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_WHEN);
    }

    public static String getSortKey(Notification notification) {
        return notification.getSortKey();
    }

    public static CharSequence getSubText(Notification notification) {
        return notification.extras.getCharSequence(EXTRA_SUB_TEXT);
    }

    public static long getTimeoutAfter(Notification notification) {
        return notification.getTimeoutAfter();
    }

    public static boolean getUsesChronometer(Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_CHRONOMETER);
    }

    public static int getVisibility(Notification notification) {
        return notification.visibility;
    }

    public static boolean hasPromotableCharacteristics(Notification notification) {
        if (Build.VERSION.SDK_INT >= 36) {
            return aa.d(notification);
        }
        return false;
    }

    public static boolean isGroupSummary(Notification notification) {
        return (notification.flags & 512) != 0;
    }

    public static boolean isRequestPromotedOngoing(Notification notification) {
        return notification.extras.getBoolean(EXTRA_REQUEST_PROMOTED_ONGOING, false);
    }

    public static boolean isSilent(Notification notification) {
        if (GROUP_KEY_SILENT.equals(notification.getGroup())) {
            return true;
        }
        return isGroupSummary(notification) ? getGroupAlertBehavior(notification) == 2 : getGroupAlertBehavior(notification) == 1;
    }

    public static Bitmap reduceLargeIconSize(Context context, Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
    }
}
