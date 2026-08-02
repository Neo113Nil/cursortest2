package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.webkit.WebView;
import com.ironsource.InterfaceC4271qa;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.fa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4074fa extends WebView implements InterfaceC4288ra {
    private InterfaceC4271qa a;

    @Nullable
    private Pc b;

    public /* synthetic */ C4074fa(Context context, InterfaceC4271qa interfaceC4271qa, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new InterfaceC4271qa.a(0, 1, null) : interfaceC4271qa);
    }

    @Override // com.ironsource.InterfaceC4288ra
    public void a(@NotNull String str) {
        str.getClass();
        InterfaceC4271qa interfaceC4271qa = this.a;
        if (interfaceC4271qa == null) {
            Intrinsics.i("javascriptEngine");
            throw null;
        }
        if (!interfaceC4271qa.a()) {
            InterfaceC4271qa interfaceC4271qa2 = this.a;
            if (interfaceC4271qa2 == null) {
                Intrinsics.i("javascriptEngine");
                throw null;
            }
            interfaceC4271qa2.a(this);
        }
        InterfaceC4271qa interfaceC4271qa3 = this.a;
        if (interfaceC4271qa3 != null) {
            interfaceC4271qa3.a(str);
        } else {
            Intrinsics.i("javascriptEngine");
            throw null;
        }
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @NotNull KeyEvent keyEvent) {
        Pc pc;
        keyEvent.getClass();
        if (i == 4 && (pc = this.b) != null && pc.onBackButtonPressed()) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4074fa(@NotNull Context context, @NotNull InterfaceC4271qa interfaceC4271qa) {
        this(context);
        context.getClass();
        interfaceC4271qa.getClass();
        this.a = interfaceC4271qa;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4074fa(@NotNull Context context) {
        super(context);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4074fa(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4074fa(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        attributeSet.getClass();
    }

    public final void a(@Nullable Pc pc) {
        this.b = pc;
    }

    public final void a() {
        this.b = null;
    }
}
