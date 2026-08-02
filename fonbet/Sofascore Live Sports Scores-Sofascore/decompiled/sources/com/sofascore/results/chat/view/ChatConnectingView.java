package com.sofascore.results.chat.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.sofascore.results.R;
import defpackage.dd;
import defpackage.fn6;
import defpackage.hxj;
import defpackage.mzb;
import defpackage.nq8;
import defpackage.o8;
import defpackage.org;
import defpackage.yhk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004R*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/sofascore/results/chat/view/ChatConnectingView;", "Lo8;", "", "getLayoutId", "()I", "Lkotlin/Function0;", "", InneractiveMediationDefs.GENDER_MALE, "Lkotlin/jvm/functions/Function0;", "getConnectCallback", "()Lkotlin/jvm/functions/Function0;", "setConnectCallback", "(Lkotlin/jvm/functions/Function0;)V", "connectCallback", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ChatConnectingView extends o8 {
    public final Handler d;
    public final Handler e;
    public final Handler f;
    public final int g;
    public final int h;
    public final mzb i;
    public boolean j;
    public boolean k;
    public int l;

    /* renamed from: m, reason: from kotlin metadata */
    public Function0 connectCallback;
    public final dd n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatConnectingView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        this.d = new Handler(Looper.getMainLooper());
        this.e = new Handler(Looper.getMainLooper());
        this.f = new Handler(Looper.getMainLooper());
        this.g = context.getColor(R.color.alert);
        this.h = context.getColor(R.color.success);
        fn6 fn6Var = new fn6();
        fn6Var.a = 0.3f;
        org orgVar = new org();
        orgVar.a = false;
        mzb mzbVar = new mzb(fn6Var, orgVar);
        mzbVar.c = 200L;
        this.i = mzbVar;
        this.l = 1;
        View root = getRoot();
        LinearLayout linearLayout = (LinearLayout) root;
        int i = R.id.progress;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) nq8.B(R.id.progress, root);
        if (circularProgressIndicator != null) {
            i = R.id.text;
            TextView textView = (TextView) nq8.B(R.id.text, root);
            if (textView != null) {
                this.n = new dd(linearLayout, circularProgressIndicator, textView, 3);
                LayoutInflater.from(context).inflate(R.layout.chat_connecting_view, (ViewGroup) this, true);
                return;
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Nullable
    public final Function0<Unit> getConnectCallback() {
        return this.connectCallback;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.chat_connecting_view;
    }

    public final void j() {
        if (!this.j) {
            getRoot().setVisibility(8);
        }
        this.l = 1;
        this.d.removeCallbacksAndMessages(null);
        this.f.removeCallbacksAndMessages(null);
        this.e.removeCallbacksAndMessages(null);
    }

    public final void l() {
        if (this.j) {
            return;
        }
        this.j = true;
        getRoot().setVisibility(0);
        getRoot().setBackgroundColor(this.g);
        dd ddVar = this.n;
        ((CircularProgressIndicator) ddVar.c).setVisibility(0);
        ((TextView) ddVar.d).setText(getContext().getString(R.string.connecting));
        hxj.a((LinearLayout) ddVar.b, this.i);
        getRoot().setVisibility(0);
    }

    public final void setConnectCallback(@Nullable Function0<Unit> function0) {
        this.connectCallback = function0;
    }
}
