package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class bfd {
    public static dfd a(Notification.BubbleMetadata bubbleMetadata) {
        if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
            return null;
        }
        PendingIntent intent = bubbleMetadata.getIntent();
        Icon icon = bubbleMetadata.getIcon();
        PorterDuff.Mode mode = IconCompat.k;
        n9e.s(icon);
        if (intent == null) {
            yhk.s("Bubble requires non-null pending intent");
            return null;
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
        return new dfd();
    }
}
