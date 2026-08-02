package com.swmansion.rnscreens.gamma.stack.screen;

import android.util.Log;
import androidx.activity.F;
import androidx.lifecycle.AbstractC2185j;
import androidx.lifecycle.InterfaceC2191p;
import androidx.lifecycle.InterfaceC2193s;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R*\u0010\t\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u0016R\u0014\u0010\u001f\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001c¨\u0006 "}, d2 = {"Lcom/swmansion/rnscreens/gamma/stack/screen/PreventNativeDismissCallback;", "Landroidx/activity/F;", "Landroidx/lifecycle/p;", "Lcom/swmansion/rnscreens/gamma/stack/screen/a;", "Landroidx/lifecycle/s;", "lifecycleOwner", "Lcom/swmansion/rnscreens/gamma/stack/screen/b;", "screen", "", "canBeEnabled", "<init>", "(Landroidx/lifecycle/s;Lcom/swmansion/rnscreens/gamma/stack/screen/b;Z)V", "", "handleOnBackPressed", "()V", "source", "Landroidx/lifecycle/j$a;", "event", "k", "(Landroidx/lifecycle/s;Landroidx/lifecycle/j$a;)V", "newValue", "a", "(Z)V", com.google.crypto.tink.integration.android.b.f37029b, "Lcom/swmansion/rnscreens/gamma/stack/screen/b;", EventKeys.VALUE_KEY, "Z", "getCanBeEnabled$react_native_screens_release", "()Z", W9.d.f13160a, "c", "shouldBeEnabled", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PreventNativeDismissCallback extends F implements InterfaceC2191p, com.swmansion.rnscreens.gamma.stack.screen.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final b screen;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean canBeEnabled;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbstractC2185j.a.values().length];
            try {
                iArr[AbstractC2185j.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC2185j.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC2185j.a.ON_STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC2185j.a.ON_DESTROY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreventNativeDismissCallback(InterfaceC2193s lifecycleOwner, b screen, boolean z10) {
        super(false);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.screen = screen;
        this.canBeEnabled = z10;
        lifecycleOwner.getLifecycle().a(this);
    }

    @Override // com.swmansion.rnscreens.gamma.stack.screen.a
    public void a(boolean newValue) {
        b();
    }

    public final void b() {
        setEnabled(c());
    }

    public final boolean c() {
        return this.canBeEnabled && this.screen.e();
    }

    public final void d(boolean z10) {
        this.canBeEnabled = z10;
        b();
    }

    @Override // androidx.activity.F
    public void handleOnBackPressed() {
        Log.i("RNScreens", "PreventNativeDismissCallback called for screen " + this.screen.getScreenKey());
        this.screen.g();
    }

    @Override // androidx.lifecycle.InterfaceC2191p
    public void k(InterfaceC2193s source, AbstractC2185j.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        int i10 = a.$EnumSwitchMapping$0[event.ordinal()];
        if (i10 == 1) {
            this.screen.setPreventNativeDismissChangeObserver$react_native_screens_release(this);
            return;
        }
        if (i10 == 2) {
            b();
            return;
        }
        if (i10 == 3) {
            setEnabled(false);
        } else {
            if (i10 != 4) {
                return;
            }
            source.getLifecycle().d(this);
            this.screen.setPreventNativeDismissChangeObserver$react_native_screens_release(null);
        }
    }
}
