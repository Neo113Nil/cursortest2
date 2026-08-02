package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class cfd {
    public static dfd a(Notification.BubbleMetadata bubbleMetadata) {
        in5 in5Var;
        if (bubbleMetadata == null) {
            return null;
        }
        if (bubbleMetadata.getShortcutId() != null) {
            String shortcutId = bubbleMetadata.getShortcutId();
            in5Var = new in5();
            if (TextUtils.isEmpty(shortcutId)) {
                yhk.s("Bubble requires a non-null shortcut id");
                return null;
            }
            in5Var.d = shortcutId;
        } else {
            PendingIntent intent = bubbleMetadata.getIntent();
            Icon icon = bubbleMetadata.getIcon();
            PorterDuff.Mode mode = IconCompat.k;
            IconCompat s = n9e.s(icon);
            in5Var = new in5();
            if (intent == null) {
                yhk.s("Bubble requires non-null pending intent");
                return null;
            }
            in5Var.e = intent;
            in5Var.f = s;
        }
        in5Var.c(1, bubbleMetadata.getAutoExpandBubble());
        in5Var.g = bubbleMetadata.getDeleteIntent();
        in5Var.c(2, bubbleMetadata.isNotificationSuppressed());
        if (bubbleMetadata.getDesiredHeight() != 0) {
            in5Var.a = Math.max(bubbleMetadata.getDesiredHeight(), 0);
            in5Var.b = 0;
        }
        if (bubbleMetadata.getDesiredHeightResId() != 0) {
            in5Var.b = bubbleMetadata.getDesiredHeightResId();
            in5Var.a = 0;
        }
        IconCompat iconCompat = (IconCompat) in5Var.f;
        PendingIntent pendingIntent = (PendingIntent) in5Var.e;
        String str = in5Var.d;
        if (str == null && pendingIntent == null) {
            yhk.s("Must supply pending intent or shortcut to bubble");
            return null;
        }
        if (str != null || iconCompat != null) {
            return new dfd();
        }
        yhk.s("Must supply an icon or shortcut for the bubble");
        return null;
    }
}
