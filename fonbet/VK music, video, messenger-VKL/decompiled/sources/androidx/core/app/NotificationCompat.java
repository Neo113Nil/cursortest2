package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import xsna.c000;
import xsna.j1a0;
import xsna.kvf0;
import xsna.zgj0;

/* loaded from: classes11.dex */
public class NotificationCompat {
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

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_ANSWER_COLOR = "android.answerColor";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_ANSWER_INTENT = "android.answerIntent";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_BIG_TEXT = "android.bigText";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_IS_VIDEO = "android.callIsVideo";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_PERSON = "android.callPerson";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_PERSON_COMPAT = "android.callPersonCompat";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_TYPE = "android.callType";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CHANNEL_GROUP_ID = "android.intent.extra.CHANNEL_GROUP_ID";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CHANNEL_ID = "android.intent.extra.CHANNEL_ID";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CHRONOMETER_COUNT_DOWN = "android.chronometerCountDown";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_COLORIZED = "android.colorized";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_COMPACT_ACTIONS = "android.compactActions";
    public static final String EXTRA_COMPAT_TEMPLATE = "androidx.core.app.extra.COMPAT_TEMPLATE";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_DECLINE_COLOR = "android.declineColor";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_DECLINE_INTENT = "android.declineIntent";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_HANG_UP_INTENT = "android.hangUpIntent";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_HIDDEN_CONVERSATION_TITLE = "android.hiddenConversationTitle";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_HISTORIC_MESSAGES = "android.messages.historic";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_INFO_TEXT = "android.infoText";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_IS_GROUP_CONVERSATION = "android.isGroupConversation";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_LARGE_ICON = "android.largeIcon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_MEDIA_SESSION = "android.mediaSession";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_MESSAGES = "android.messages";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_MESSAGING_STYLE_USER = "android.messagingStyleUser";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_NOTIFICATION_ID = "android.intent.extra.NOTIFICATION_ID";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_NOTIFICATION_TAG = "android.intent.extra.NOTIFICATION_TAG";

    @SuppressLint({"ActionValue"})
    @Deprecated
    public static final String EXTRA_PEOPLE = "android.people";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PEOPLE_LIST = "android.people.list";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PICTURE = "android.picture";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PICTURE_CONTENT_DESCRIPTION = "android.pictureContentDescription";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PICTURE_ICON = "android.pictureIcon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS = "android.progress";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS_END_ICON = "android.progressEndIcon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS_MAX = "android.progressMax";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS_POINTS = "android.progressPoints";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS_SEGMENTS = "android.progressSegments";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS_START_ICON = "android.progressStartIcon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS_TRACKER_ICON = "android.progressTrackerIcon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_REQUEST_PROMOTED_ONGOING = "android.requestPromotedOngoing";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHORT_CRITICAL_TEXT = "android.shortCriticalText";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED = "android.showBigPictureWhenCollapsed";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHOW_WHEN = "android.showWhen";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SMALL_ICON = "android.icon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_STYLED_BY_PROGRESS = "android.styledByProgress";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SUB_TEXT = "android.subText";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SUMMARY_TEXT = "android.summaryText";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TEMPLATE = "android.template";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TEXT = "android.text";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TEXT_LINES = "android.textLines";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TITLE = "android.title";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TITLE_BIG = "android.title.big";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_VERIFICATION_ICON = "android.verificationIcon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_VERIFICATION_ICON_COMPAT = "android.verificationIconCompat";

    @SuppressLint({"ActionValue"})
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

    @SuppressLint({"ActionValue"})
    public static final String INTENT_CATEGORY_NOTIFICATION_PREFERENCES = "android.intent.category.NOTIFICATION_PREFERENCES";
    public static final int MAX_ACTION_BUTTONS = 3;
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_MAX = 2;
    public static final int PRIORITY_MIN = -2;
    public static final int STREAM_DEFAULT = -1;
    private static final String TAG = "NotifCompat";
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_SECRET = -1;

    public static class a {
        public final Bundle a;
        public IconCompat b;
        public final kvf0[] c;
        public final boolean d;
        public final boolean e;
        public final int f;
        public final boolean g;

        @Deprecated
        public final int h;
        public final CharSequence i;
        public final PendingIntent j;
        public final boolean k;

        /* renamed from: androidx.core.app.NotificationCompat$a$a, reason: collision with other inner class name */
        public static final class C0022a {
            public final IconCompat a;
            public final CharSequence b;
            public final PendingIntent c;
            public boolean d;
            public final Bundle e;
            public ArrayList<kvf0> f;
            public int g;
            public boolean h;

            public C0022a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle());
            }

            public final void a(kvf0 kvf0Var) {
                if (this.f == null) {
                    this.f = new ArrayList<>();
                }
                this.f.add(kvf0Var);
            }

            public final a b() {
                CharSequence[] charSequenceArr;
                Set<String> set;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<kvf0> arrayList3 = this.f;
                if (arrayList3 != null) {
                    Iterator<kvf0> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        kvf0 next = it.next();
                        if (next.d || (!((charSequenceArr = next.c) == null || charSequenceArr.length == 0) || (set = next.g) == null || set.isEmpty())) {
                            arrayList2.add(next);
                        } else {
                            arrayList.add(next);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                }
                return new a(this.a, this.b, this.c, this.e, arrayList2.isEmpty() ? null : (kvf0[]) arrayList2.toArray(new kvf0[arrayList2.size()]), this.d, this.g, this.h, false, false);
            }

            public C0022a(int i, String str, PendingIntent pendingIntent) {
                this(i != 0 ? IconCompat.e(i, null, "") : null, str, pendingIntent, new Bundle());
            }

            public C0022a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
                this.d = true;
                this.h = true;
                this.a = iconCompat;
                this.b = h.d(charSequence);
                this.c = pendingIntent;
                this.e = bundle;
                this.f = null;
                this.d = true;
                this.g = 0;
                this.h = true;
            }
        }

        public a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.e(i, null, "") : null, charSequence, pendingIntent);
        }

        public final IconCompat a() {
            int i;
            if (this.b == null && (i = this.h) != 0) {
                this.b = IconCompat.e(i, null, "");
            }
            return this.b;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (kvf0[]) null, true, 0, true, false, false);
        }

        public a(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, kvf0[] kvf0VarArr, boolean z, int i2, boolean z2, boolean z3, boolean z4) {
            this(i != 0 ? IconCompat.e(i, null, "") : null, charSequence, pendingIntent, bundle, kvf0VarArr, z, i2, z2, z3, z4);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, kvf0[] kvf0VarArr, boolean z, int i, boolean z2, boolean z3, boolean z4) {
            this.e = true;
            this.b = iconCompat;
            if (iconCompat != null && iconCompat.h() == 2) {
                this.h = iconCompat.f();
            }
            this.i = h.d(charSequence);
            this.j = pendingIntent;
            this.a = bundle == null ? new Bundle() : bundle;
            this.c = kvf0VarArr;
            this.d = z;
            this.f = i;
            this.e = z2;
            this.g = z3;
            this.k = z4;
        }
    }

    public static class b {
        public static boolean a(Notification notification) {
            return notification.getAllowSystemGeneratedContextualActions();
        }

        public static Notification.BubbleMetadata b(Notification notification) {
            return notification.getBubbleMetadata();
        }

        public static int c(RemoteInput remoteInput) {
            return remoteInput.getEditChoicesBeforeSending();
        }

        public static LocusId d(Notification notification) {
            return notification.getLocusId();
        }

        public static boolean e(Notification.Action action) {
            return action.isContextual();
        }
    }

    public static class c {
        public static boolean a(Notification.Action action) {
            return action.isAuthenticationRequired();
        }
    }

    public static class d {
        public static boolean a(Notification notification) {
            return notification.hasPromotableCharacteristics();
        }
    }

    public static class e extends m {
        public IconCompat e;
        public IconCompat f;
        public boolean g;

        public static class a {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                bigPictureStyle.showBigPictureWhenCollapsed(z);
            }
        }

        @Override // androidx.core.app.NotificationCompat.m
        public final void b(androidx.core.app.a aVar) {
            Bitmap bitmap;
            Context context = aVar.a;
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(aVar.b).setBigContentTitle(this.b);
            IconCompat iconCompat = this.e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    a.a(bigContentTitle, iconCompat.l(context));
                } else if (iconCompat.h() == 1) {
                    IconCompat iconCompat2 = this.e;
                    int i = iconCompat2.a;
                    if (i == -1) {
                        Object obj = iconCompat2.b;
                        bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                    } else if (i == 1) {
                        bitmap = (Bitmap) iconCompat2.b;
                    } else {
                        if (i != 5) {
                            throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                        }
                        Bitmap bitmap2 = (Bitmap) iconCompat2.b;
                        int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        Paint paint = new Paint(3);
                        float f = min;
                        float f2 = 0.5f * f;
                        float f3 = 0.9166667f * f2;
                        float f4 = 0.010416667f * f;
                        paint.setColor(0);
                        paint.setShadowLayer(f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f * 0.020833334f, 1023410176);
                        canvas.drawCircle(f2, f2, f3, paint);
                        paint.setShadowLayer(f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 503316480);
                        canvas.drawCircle(f2, f2, f3, paint);
                        paint.clearShadowLayer();
                        paint.setColor(-16777216);
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                        Matrix matrix = new Matrix();
                        matrix.setTranslate((-(bitmap2.getWidth() - min)) / 2.0f, (-(bitmap2.getHeight() - min)) / 2.0f);
                        bitmapShader.setLocalMatrix(matrix);
                        paint.setShader(bitmapShader);
                        canvas.drawCircle(f2, f2, f3, paint);
                        canvas.setBitmap(null);
                        bitmap = createBitmap;
                    }
                    bigContentTitle = bigContentTitle.bigPicture(bitmap);
                }
            }
            if (this.g) {
                IconCompat iconCompat3 = this.f;
                if (iconCompat3 == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    bigContentTitle.bigLargeIcon(iconCompat3.l(context));
                }
            }
            if (this.d) {
                bigContentTitle.setSummaryText(this.c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                a.c(bigContentTitle, false);
                a.b(bigContentTitle, null);
            }
        }

        @Override // androidx.core.app.NotificationCompat.m
        public final String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }
    }

    public static class f extends m {
        public CharSequence e;

        @Override // androidx.core.app.NotificationCompat.m
        public final void b(androidx.core.app.a aVar) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(aVar.b).setBigContentTitle(this.b).bigText(this.e);
            if (this.d) {
                bigText.setSummaryText(this.c);
            }
        }

        @Override // androidx.core.app.NotificationCompat.m
        public final String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public final void e(String str) {
            this.e = h.d(str);
        }
    }

    public static final class g {

        public static class a {
            public static g a(Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                    return null;
                }
                PendingIntent intent = bubbleMetadata.getIntent();
                Icon icon = bubbleMetadata.getIcon();
                PorterDuff.Mode mode = IconCompat.k;
                IconCompat.a.a(icon);
                if (intent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                bubbleMetadata.getAutoExpandBubble();
                bubbleMetadata.getDeleteIntent();
                bubbleMetadata.isNotificationSuppressed();
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    Math.max(bubbleMetadata.getDesiredHeight(), 0);
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    bubbleMetadata.getDesiredHeightResId();
                }
                return new g();
            }
        }

        public static class b {
            public static g a(Notification.BubbleMetadata bubbleMetadata) {
                c cVar;
                if (bubbleMetadata == null) {
                    return null;
                }
                if (bubbleMetadata.getShortcutId() != null) {
                    String shortcutId = bubbleMetadata.getShortcutId();
                    cVar = new c();
                    if (TextUtils.isEmpty(shortcutId)) {
                        throw new NullPointerException("Bubble requires a non-null shortcut id");
                    }
                    cVar.g = shortcutId;
                } else {
                    PendingIntent intent = bubbleMetadata.getIntent();
                    Icon icon = bubbleMetadata.getIcon();
                    PorterDuff.Mode mode = IconCompat.k;
                    IconCompat a = IconCompat.a.a(icon);
                    cVar = new c();
                    if (intent == null) {
                        throw new NullPointerException("Bubble requires non-null pending intent");
                    }
                    cVar.a = intent;
                    cVar.b = a;
                }
                cVar.a(1, bubbleMetadata.getAutoExpandBubble());
                cVar.f = bubbleMetadata.getDeleteIntent();
                cVar.a(2, bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    cVar.c = Math.max(bubbleMetadata.getDesiredHeight(), 0);
                    cVar.d = 0;
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    cVar.d = bubbleMetadata.getDesiredHeightResId();
                    cVar.c = 0;
                }
                IconCompat iconCompat = cVar.b;
                PendingIntent pendingIntent = cVar.a;
                String str = cVar.g;
                if (str == null && pendingIntent == null) {
                    throw new NullPointerException("Must supply pending intent or shortcut to bubble");
                }
                if (str == null && iconCompat == null) {
                    throw new NullPointerException("Must supply an icon or shortcut for the bubble");
                }
                return new g();
            }
        }

        public static final class c {
            public PendingIntent a;
            public IconCompat b;
            public int c;
            public int d;
            public int e;
            public PendingIntent f;
            public String g;

            public final void a(int i, boolean z) {
                if (z) {
                    this.e = i | this.e;
                } else {
                    this.e = (~i) & this.e;
                }
            }
        }
    }

    public static class i extends m {
        public final int e;
        public final j1a0 f;
        public final PendingIntent g;
        public final PendingIntent h;
        public final PendingIntent i;

        public static class b {
            public static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            public static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            public static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            public static Notification.CallStyle d(Notification.CallStyle callStyle, boolean z) {
                return callStyle.setIsVideo(z);
            }

            public static Notification.CallStyle e(Notification.CallStyle callStyle, CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        public i() {
        }

        @Override // androidx.core.app.NotificationCompat.m
        public final void a(Bundle bundle) {
            super.a(bundle);
            bundle.putInt(NotificationCompat.EXTRA_CALL_TYPE, this.e);
            bundle.putBoolean(NotificationCompat.EXTRA_CALL_IS_VIDEO, false);
            j1a0 j1a0Var = this.f;
            if (j1a0Var != null) {
                bundle.putParcelable(NotificationCompat.EXTRA_CALL_PERSON, a.b(j1a0Var.b()));
            }
            bundle.putCharSequence(NotificationCompat.EXTRA_VERIFICATION_TEXT, null);
            bundle.putParcelable(NotificationCompat.EXTRA_ANSWER_INTENT, this.g);
            bundle.putParcelable(NotificationCompat.EXTRA_DECLINE_INTENT, this.h);
            bundle.putParcelable(NotificationCompat.EXTRA_HANG_UP_INTENT, this.i);
        }

        @Override // androidx.core.app.NotificationCompat.m
        public final void b(androidx.core.app.a aVar) {
            Notification.CallStyle a2;
            Notification.Builder builder = aVar.b;
            int i = Build.VERSION.SDK_INT;
            int i2 = this.e;
            String str = null;
            j1a0 j1a0Var = this.f;
            if (i >= 31) {
                PendingIntent pendingIntent = this.g;
                if (i2 != 1) {
                    PendingIntent pendingIntent2 = this.i;
                    if (i2 == 2) {
                        a2 = b.b(j1a0Var.b(), pendingIntent2);
                    } else if (i2 != 3) {
                        if (Log.isLoggable(NotificationCompat.TAG, 3)) {
                            String.valueOf(i2);
                        }
                        a2 = null;
                    } else {
                        a2 = b.c(j1a0Var.b(), pendingIntent2, pendingIntent);
                    }
                } else {
                    a2 = b.a(j1a0Var.b(), this.h, pendingIntent);
                }
                if (a2 != null) {
                    a2.setBuilder(builder);
                    b.e(a2, null);
                    b.d(a2, false);
                    return;
                }
                return;
            }
            builder.setContentTitle(j1a0Var != null ? j1a0Var.a : null);
            Bundle bundle = this.a.v;
            CharSequence charSequence = (bundle == null || !bundle.containsKey(NotificationCompat.EXTRA_TEXT)) ? null : this.a.v.getCharSequence(NotificationCompat.EXTRA_TEXT);
            if (charSequence == null) {
                if (i2 == 1) {
                    str = this.a.a.getResources().getString(R.string.call_notification_incoming_text);
                } else if (i2 == 2) {
                    str = this.a.a.getResources().getString(R.string.call_notification_ongoing_text);
                } else if (i2 == 3) {
                    str = this.a.a.getResources().getString(R.string.call_notification_screening_text);
                }
                charSequence = str;
            }
            builder.setContentText(charSequence);
            if (j1a0Var != null) {
                IconCompat iconCompat = j1a0Var.b;
                if (iconCompat != null) {
                    builder.setLargeIcon(iconCompat.l(this.a.a));
                }
                a.a(builder, j1a0Var.b());
            }
            builder.setCategory(NotificationCompat.CATEGORY_CALL);
        }

        @Override // androidx.core.app.NotificationCompat.m
        public final String c() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        public final a e(int i, int i2, int i3, PendingIntent pendingIntent) {
            Integer valueOf = Integer.valueOf(this.a.a.getColor(i3));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.a.a.getResources().getString(i2));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(valueOf.intValue()), 0, spannableStringBuilder.length(), 18);
            a b2 = new a.C0022a(IconCompat.d(i, this.a.a), spannableStringBuilder, pendingIntent).b();
            b2.a.putBoolean("key_action_priority", true);
            return b2;
        }

        public i(int i, j1a0 j1a0Var, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3) {
            if (TextUtils.isEmpty(j1a0Var.a)) {
                throw new IllegalArgumentException("person must have a non-empty a name");
            }
            this.e = i;
            this.f = j1a0Var;
            this.g = pendingIntent3;
            this.h = pendingIntent2;
            this.i = pendingIntent;
        }

        public static class a {
            public static Notification.Builder a(Notification.Builder builder, Person person) {
                return builder.addPerson(person);
            }

            public static Parcelable b(Person person) {
                return person;
            }
        }
    }

    public static class j extends m {

        public static class a {
            public static Notification.Style a() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        @Override // androidx.core.app.NotificationCompat.m
        public final void b(androidx.core.app.a aVar) {
            aVar.b.setStyle(a.a());
        }

        @Override // androidx.core.app.NotificationCompat.m
        public final String c() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }
    }

    public static class k extends m {
        public final ArrayList<CharSequence> e = new ArrayList<>();

        @Override // androidx.core.app.NotificationCompat.m
        public final void b(androidx.core.app.a aVar) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(aVar.b).setBigContentTitle(this.b);
            if (this.d) {
                bigContentTitle.setSummaryText(this.c);
            }
            Iterator<CharSequence> it = this.e.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine(it.next());
            }
        }

        @Override // androidx.core.app.NotificationCompat.m
        public final String c() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    public static final class n {
        public Bitmap d;
        public ArrayList<a> a = new ArrayList<>();
        public int b = 1;
        public ArrayList<Notification> c = new ArrayList<>();
        public int e = 8388613;
        public int f = -1;
        public int g = 80;

        public static class a {
            public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
                return builder.setAllowGeneratedReplies(z);
            }
        }

        public static class b {
            public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
                return builder.setAuthenticationRequired(z);
            }
        }

        public final Object clone() throws CloneNotSupportedException {
            n nVar = new n();
            nVar.a = new ArrayList<>(this.a);
            nVar.b = this.b;
            nVar.c = new ArrayList<>(this.c);
            nVar.d = this.d;
            nVar.e = this.e;
            nVar.f = this.f;
            nVar.g = this.g;
            return nVar;
        }
    }

    @Deprecated
    public NotificationCompat() {
    }

    public static a getAction(Notification notification, int i2) {
        return getActionCompatFromAction(notification.actions[i2]);
    }

    public static a getActionCompatFromAction(Notification.Action action) {
        kvf0[] kvf0VarArr;
        int i2;
        RemoteInput[] remoteInputs = action.getRemoteInputs();
        IconCompat iconCompat = null;
        if (remoteInputs == null) {
            kvf0VarArr = null;
        } else {
            kvf0[] kvf0VarArr2 = new kvf0[remoteInputs.length];
            for (int i3 = 0; i3 < remoteInputs.length; i3++) {
                RemoteInput remoteInput = remoteInputs[i3];
                kvf0VarArr2[i3] = new kvf0(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), Build.VERSION.SDK_INT >= 29 ? b.c(remoteInput) : 0, remoteInput.getExtras(), null);
            }
            kvf0VarArr = kvf0VarArr2;
        }
        int i4 = Build.VERSION.SDK_INT;
        boolean z = action.getExtras().getBoolean("android.support.allowGeneratedReplies") || action.getAllowGeneratedReplies();
        boolean z2 = action.getExtras().getBoolean("android.support.action.showsUserInterface", true);
        int semanticAction = action.getSemanticAction();
        boolean e2 = i4 >= 29 ? b.e(action) : false;
        boolean a2 = i4 >= 31 ? c.a(action) : false;
        if (action.getIcon() == null && (i2 = action.icon) != 0) {
            return new a(i2, action.title, action.actionIntent, action.getExtras(), kvf0VarArr, z, semanticAction, z2, e2, a2);
        }
        if (action.getIcon() != null) {
            Icon icon = action.getIcon();
            PorterDuff.Mode mode = IconCompat.k;
            if (icon.getType() != 2 || icon.getResId() != 0) {
                iconCompat = IconCompat.a.a(icon);
            }
        }
        return new a(iconCompat, action.title, action.actionIntent, action.getExtras(), kvf0VarArr, z, semanticAction, z2, e2, a2);
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
            return b.a(notification);
        }
        return false;
    }

    public static boolean getAutoCancel(Notification notification) {
        return (notification.flags & 16) != 0;
    }

    public static int getBadgeIconType(Notification notification) {
        return notification.getBadgeIconType();
    }

    public static g getBubbleMetadata(Notification notification) {
        Notification.BubbleMetadata b2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || (b2 = b.b(notification)) == null) {
            return null;
        }
        if (i2 >= 30) {
            return g.b.a(b2);
        }
        if (i2 == 29) {
            return g.a.a(b2);
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

    public static List<a> getInvisibleActions(Notification notification) {
        Bundle bundle;
        Bundle[] bundleArr;
        Bundle[] bundleArr2;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle2 != null && (bundle = bundle2.getBundle("invisible_actions")) != null) {
            for (int i2 = 0; i2 < bundle.size(); i2++) {
                Bundle bundle3 = bundle.getBundle(Integer.toString(i2));
                Bundle bundle4 = bundle3.getBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS);
                boolean z = bundle4 != null ? bundle4.getBoolean("android.support.allowGeneratedReplies", false) : false;
                int i3 = bundle3.getInt("icon");
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
                kvf0[] a2 = androidx.core.app.b.a(bundleArr);
                Parcelable[] parcelableArray2 = bundle3.getParcelableArray("dataOnlyRemoteInputs");
                if ((parcelableArray2 instanceof Bundle[]) || parcelableArray2 == null) {
                    bundleArr2 = (Bundle[]) parcelableArray2;
                } else {
                    bundleArr2 = (Bundle[]) Arrays.copyOf(parcelableArray2, parcelableArray2.length, Bundle[].class);
                    bundle3.putParcelableArray("dataOnlyRemoteInputs", bundleArr2);
                }
                androidx.core.app.b.a(bundleArr2);
                arrayList.add(new a(i3, charSequence, pendingIntent, bundle5, a2, z, bundle3.getInt("semanticAction"), bundle3.getBoolean("showsUserInterface"), false, false));
            }
        }
        return arrayList;
    }

    public static boolean getLocalOnly(Notification notification) {
        return (notification.flags & 256) != 0;
    }

    public static c000 getLocusId(Notification notification) {
        LocusId d2;
        if (Build.VERSION.SDK_INT < 29 || (d2 = b.d(notification)) == null) {
            return null;
        }
        String b2 = c000.a.b(d2);
        if (TextUtils.isEmpty(b2)) {
            throw new IllegalArgumentException("id cannot be empty");
        }
        return new c000(b2);
    }

    public static Notification[] getNotificationArrayFromBundle(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
            return (Notification[]) parcelableArray;
        }
        Notification[] notificationArr = new Notification[parcelableArray.length];
        for (int i2 = 0; i2 < parcelableArray.length; i2++) {
            notificationArr[i2] = (Notification) parcelableArray[i2];
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

    public static List<j1a0> getPeople(Notification notification) {
        IconCompat iconCompat;
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = notification.extras.getParcelableArrayList(EXTRA_PEOPLE_LIST);
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                Person person = (Person) it.next();
                CharSequence name = person.getName();
                if (person.getIcon() != null) {
                    Icon icon = person.getIcon();
                    PorterDuff.Mode mode = IconCompat.k;
                    iconCompat = IconCompat.a.a(icon);
                } else {
                    iconCompat = null;
                }
                String uri = person.getUri();
                String key = person.getKey();
                boolean isBot = person.isBot();
                boolean isImportant = person.isImportant();
                j1a0 j1a0Var = new j1a0();
                j1a0Var.a = name;
                j1a0Var.b = iconCompat;
                j1a0Var.c = uri;
                j1a0Var.d = key;
                j1a0Var.e = isBot;
                j1a0Var.f = isImportant;
                arrayList.add(j1a0Var);
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
            return d.a(notification);
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

    public static class l extends m {
        public final ArrayList e = new ArrayList();
        public final ArrayList f = new ArrayList();
        public final j1a0 g;
        public CharSequence h;
        public Boolean i;

        public static class a {
            public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        public static class b {
            public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        public static class c {
            public static Notification.MessagingStyle a(Person person) {
                return new Notification.MessagingStyle(person);
            }

            public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z) {
                return messagingStyle.setGroupConversation(z);
            }
        }

        public l() {
        }

        @Override // androidx.core.app.NotificationCompat.m
        public final void a(Bundle bundle) {
            super.a(bundle);
            j1a0 j1a0Var = this.g;
            bundle.putCharSequence(NotificationCompat.EXTRA_SELF_DISPLAY_NAME, j1a0Var.a);
            bundle.putBundle(NotificationCompat.EXTRA_MESSAGING_STYLE_USER, j1a0Var.c());
            bundle.putCharSequence(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE, this.h);
            if (this.h != null && this.i.booleanValue()) {
                bundle.putCharSequence(NotificationCompat.EXTRA_CONVERSATION_TITLE, this.h);
            }
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                bundle.putParcelableArray(NotificationCompat.EXTRA_MESSAGES, d.a(arrayList));
            }
            ArrayList arrayList2 = this.f;
            if (!arrayList2.isEmpty()) {
                bundle.putParcelableArray(NotificationCompat.EXTRA_HISTORIC_MESSAGES, d.a(arrayList2));
            }
            Boolean bool = this.i;
            if (bool != null) {
                bundle.putBoolean(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION, bool.booleanValue());
            }
        }

        @Override // androidx.core.app.NotificationCompat.m
        public final void b(androidx.core.app.a aVar) {
            h hVar = this.a;
            boolean z = false;
            if (hVar == null || hVar.a.getApplicationInfo().targetSdkVersion >= 28 || this.i != null) {
                Boolean bool = this.i;
                if (bool != null) {
                    z = bool.booleanValue();
                }
            } else if (this.h != null) {
                z = true;
            }
            this.i = Boolean.valueOf(z);
            Notification.MessagingStyle a2 = c.a(this.g.b());
            Iterator it = this.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                d dVar = (d) it.next();
                j1a0 j1a0Var = dVar.c;
                Notification.MessagingStyle.Message b2 = d.b.b(dVar.a, dVar.b, j1a0Var != null ? j1a0Var.b() : null);
                String str = dVar.e;
                if (str != null) {
                    d.a.a(b2, str, dVar.f);
                }
                a.a(a2, b2);
            }
            Iterator it2 = this.f.iterator();
            while (it2.hasNext()) {
                d dVar2 = (d) it2.next();
                j1a0 j1a0Var2 = dVar2.c;
                Notification.MessagingStyle.Message b3 = d.b.b(dVar2.a, dVar2.b, j1a0Var2 == null ? null : j1a0Var2.b());
                String str2 = dVar2.e;
                if (str2 != null) {
                    d.a.a(b3, str2, dVar2.f);
                }
                b.a(a2, b3);
            }
            this.i.getClass();
            a.b(a2, this.h);
            c.b(a2, this.i.booleanValue());
            a2.setBuilder(aVar.b);
        }

        @Override // androidx.core.app.NotificationCompat.m
        public final String c() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        @Deprecated
        public final void e(long j, String str, String str2) {
            j1a0 j1a0Var = new j1a0();
            j1a0Var.a = str2;
            j1a0Var.b = null;
            j1a0Var.c = null;
            j1a0Var.d = null;
            j1a0Var.e = false;
            j1a0Var.f = false;
            d dVar = new d(str, j, j1a0Var);
            ArrayList arrayList = this.e;
            arrayList.add(dVar);
            if (arrayList.size() > 25) {
                arrayList.remove(0);
            }
        }

        public final void f(d dVar) {
            ArrayList arrayList = this.e;
            arrayList.add(dVar);
            if (arrayList.size() > 25) {
                arrayList.remove(0);
            }
        }

        @Deprecated
        public l(int i) {
            j1a0 j1a0Var = new j1a0();
            j1a0Var.a = "";
            j1a0Var.b = null;
            j1a0Var.c = null;
            j1a0Var.d = null;
            j1a0Var.e = false;
            j1a0Var.f = false;
            this.g = j1a0Var;
        }

        public l(j1a0 j1a0Var) {
            if (!TextUtils.isEmpty(j1a0Var.a)) {
                this.g = j1a0Var;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }

        public static final class d {
            public final CharSequence a;
            public final long b;
            public final j1a0 c;
            public final Bundle d = new Bundle();
            public String e;
            public Uri f;

            public static class a {
                public static Notification.MessagingStyle.Message a(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            public d(CharSequence charSequence, long j, j1a0 j1a0Var) {
                this.a = charSequence;
                this.b = j;
                this.c = j1a0Var;
            }

            public static Bundle[] a(ArrayList arrayList) {
                Bundle[] bundleArr = new Bundle[arrayList.size()];
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    d dVar = (d) arrayList.get(i);
                    j1a0 j1a0Var = dVar.c;
                    Bundle bundle = new Bundle();
                    CharSequence charSequence = dVar.a;
                    if (charSequence != null) {
                        bundle.putCharSequence("text", charSequence);
                    }
                    bundle.putLong("time", dVar.b);
                    if (j1a0Var != null) {
                        bundle.putCharSequence("sender", j1a0Var.a);
                        bundle.putParcelable("sender_person", b.a(j1a0Var.b()));
                    }
                    String str = dVar.e;
                    if (str != null) {
                        bundle.putString("type", str);
                    }
                    Uri uri = dVar.f;
                    if (uri != null) {
                        bundle.putParcelable("uri", uri);
                    }
                    Bundle bundle2 = dVar.d;
                    if (bundle2 != null) {
                        bundle.putBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS, bundle2);
                    }
                    bundleArr[i] = bundle;
                }
                return bundleArr;
            }

            public static class b {
                public static Notification.MessagingStyle.Message b(CharSequence charSequence, long j, Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j, person);
                }

                public static Parcelable a(Person person) {
                    return person;
                }
            }
        }
    }

    public static class h {
        public RemoteViews A;
        public RemoteViews B;
        public String C;
        public String D;
        public c000 E;
        public int F;
        public int G;
        public final boolean H;
        public final Notification I;
        public boolean J;

        @Deprecated
        public final ArrayList<String> K;
        public final Context a;
        public final ArrayList<a> b;
        public final ArrayList<j1a0> c;
        public final ArrayList<a> d;
        public CharSequence e;
        public CharSequence f;
        public PendingIntent g;
        public PendingIntent h;
        public IconCompat i;
        public int j;
        public int k;
        public boolean l;
        public m m;
        public CharSequence n;
        public int o;
        public int p;
        public boolean q;
        public String r;
        public boolean s;
        public boolean t;
        public String u;
        public Bundle v;
        public int w;
        public int x;
        public Notification y;
        public RemoteViews z;

        public h(Context context, String str) {
            this.b = new ArrayList<>();
            this.c = new ArrayList<>();
            this.d = new ArrayList<>();
            this.l = true;
            this.t = false;
            this.w = 0;
            this.x = 0;
            this.F = 0;
            this.G = 0;
            Notification notification = new Notification();
            this.I = notification;
            this.a = context;
            this.C = str;
            notification.when = System.currentTimeMillis();
            notification.audioStreamType = -1;
            this.k = 0;
            this.K = new ArrayList<>();
            this.H = true;
        }

        public static CharSequence d(CharSequence charSequence) {
            return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public final void A(Uri uri) {
            Notification notification = this.I;
            notification.sound = uri;
            notification.audioStreamType = -1;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
        }

        public final void B(m mVar) {
            if (this.m != mVar) {
                this.m = mVar;
                if (mVar != null) {
                    mVar.d(this);
                }
            }
        }

        public final void C(CharSequence charSequence) {
            this.n = d(charSequence);
        }

        public final void D(CharSequence charSequence) {
            this.I.tickerText = d(charSequence);
        }

        public final void E(long j) {
            this.I.when = j;
        }

        public final void a(int i, PendingIntent pendingIntent, String str) {
            this.b.add(new a(i, str, pendingIntent));
        }

        public final void b(a aVar) {
            if (aVar != null) {
                this.b.add(aVar);
            }
        }

        public final Notification c() {
            Bundle extras;
            androidx.core.app.a aVar = new androidx.core.app.a(this);
            h hVar = aVar.c;
            m mVar = hVar.m;
            if (mVar != null) {
                mVar.b(aVar);
            }
            Notification build = aVar.b.build();
            RemoteViews remoteViews = hVar.z;
            if (remoteViews != null) {
                build.contentView = remoteViews;
            }
            if (mVar != null) {
                hVar.m.getClass();
            }
            if (mVar != null && (extras = NotificationCompat.getExtras(build)) != null) {
                mVar.a(extras);
            }
            return build;
        }

        public final void e(boolean z) {
            n(16, z);
        }

        public final void f(String str) {
            this.u = str;
        }

        public final void g() {
            this.C = "com.google.android.gms.availability";
        }

        public final void h(int i) {
            this.w = i;
        }

        public final void i(PendingIntent pendingIntent) {
            this.g = pendingIntent;
        }

        public final void j(CharSequence charSequence) {
            this.f = d(charSequence);
        }

        public final void k(CharSequence charSequence) {
            this.e = d(charSequence);
        }

        public final void l(int i) {
            Notification notification = this.I;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
        }

        public final void m() {
            this.I.deleteIntent = null;
        }

        public final void n(int i, boolean z) {
            Notification notification = this.I;
            if (z) {
                notification.flags = i | notification.flags;
            } else {
                notification.flags = (~i) & notification.flags;
            }
        }

        public final void o(String str) {
            this.r = str;
        }

        public final void p() {
            this.s = true;
        }

        public final void q(Bitmap bitmap) {
            this.i = bitmap == null ? null : IconCompat.c(NotificationCompat.reduceLargeIconSize(this.a, bitmap));
        }

        public final void r(int i, int i2, int i3) {
            Notification notification = this.I;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            notification.flags = ((i2 == 0 || i3 == 0) ? 0 : 1) | (notification.flags & (-2));
        }

        public final void s() {
            this.t = true;
        }

        @Deprecated
        public final void t() {
            this.J = true;
        }

        public final void u() {
            n(2, true);
        }

        public final void v(int i) {
            this.k = i;
        }

        public final void w(int i, int i2, boolean z) {
            this.o = i;
            this.p = i2;
            this.q = z;
        }

        public final void x(zgj0 zgj0Var) {
            if (zgj0Var == null) {
                return;
            }
            String str = zgj0Var.b;
            this.D = str;
            if (this.E == null) {
                c000 c000Var = zgj0Var.k;
                if (c000Var != null) {
                    this.E = c000Var;
                } else if (str != null) {
                    this.E = new c000(str);
                }
            }
            if (this.e == null) {
                k(zgj0Var.e);
            }
        }

        public final void y() {
            this.J = true;
        }

        public final void z(int i) {
            this.I.icon = i;
        }

        @Deprecated
        public h(Context context) {
            this(context, null);
        }
    }

    public static abstract class m {
        public h a;
        public CharSequence b;
        public CharSequence c;
        public boolean d = false;

        public void a(Bundle bundle) {
            if (this.d) {
                bundle.putCharSequence(NotificationCompat.EXTRA_SUMMARY_TEXT, this.c);
            }
            CharSequence charSequence = this.b;
            if (charSequence != null) {
                bundle.putCharSequence(NotificationCompat.EXTRA_TITLE_BIG, charSequence);
            }
            String c = c();
            if (c != null) {
                bundle.putString(NotificationCompat.EXTRA_COMPAT_TEMPLATE, c);
            }
        }

        public String c() {
            return null;
        }

        public final void d(h hVar) {
            if (this.a != hVar) {
                this.a = hVar;
                hVar.B(this);
            }
        }

        public void b(androidx.core.app.a aVar) {
        }
    }

    public static Bitmap reduceLargeIconSize(Context context, Bitmap bitmap) {
        return bitmap;
    }
}
