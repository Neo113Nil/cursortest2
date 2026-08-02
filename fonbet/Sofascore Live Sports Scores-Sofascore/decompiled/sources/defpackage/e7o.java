package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class e7o extends View.AccessibilityDelegate {
    public final /* synthetic */ CastSeekBar a;

    public /* synthetic */ e7o(CastSeekBar castSeekBar) {
        this.a = castSeekBar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(SeekBar.class.getName());
        CastSeekBar castSeekBar = this.a;
        accessibilityEvent.setItemCount(castSeekBar.a.b);
        accessibilityEvent.setCurrentItemIndex(castSeekBar.getProgress());
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(SeekBar.class.getName());
        if (view.isEnabled()) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (view.isEnabled()) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            if (i == 4096 || i == 8192) {
                CastSeekBar castSeekBar = this.a;
                castSeekBar.d();
                int i2 = castSeekBar.a.b / 20;
                if (i == 8192) {
                    i2 = -i2;
                }
                castSeekBar.c(castSeekBar.getProgress() + i2);
                castSeekBar.b = false;
                bko bkoVar = castSeekBar.f;
                if (bkoVar != null) {
                    bkoVar.a(castSeekBar);
                }
            }
        }
        return false;
    }
}
