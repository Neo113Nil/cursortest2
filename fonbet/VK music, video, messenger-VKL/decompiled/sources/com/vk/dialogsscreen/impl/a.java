package com.vk.dialogsscreen.impl;

import android.content.Context;
import android.os.Bundle;
import com.vk.dialogssearch.impl.DialogsSearchFragment;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.SearchMode;
import com.vk.im.ui.fragments.im_calls_action.ImCallAction;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import io.reactivex.rxjava3.core.q;
import xsna.a1s;
import xsna.a1w;
import xsna.b1s;
import xsna.d7p;
import xsna.di3;
import xsna.epx;
import xsna.gwm;
import xsna.iwv;
import xsna.jyv;
import xsna.ko8;
import xsna.o0r0;
import xsna.o0w;
import xsna.vmm;

/* compiled from: DialogsToolbarDependenciesImpl.kt */
/* loaded from: classes18.dex */
public final class a implements gwm {
    public final a1w a;
    public final b b;
    public final C0895a c;
    public final com.vk.dialogtags.api.a d;
    public final d7p e;
    public final di3 f;
    public final ko8 g;
    public final d7p h;
    public final q<a1s> i;

    /* compiled from: DialogsToolbarDependenciesImpl.kt */
    /* renamed from: com.vk.dialogsscreen.impl.a$a, reason: collision with other inner class name */
    public static final class C0895a {
        public final vmm a;
        public final jyv b;

        public C0895a(vmm vmmVar, jyv jyvVar) {
            this.a = vmmVar;
            this.b = jyvVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0895a)) {
                return false;
            }
            C0895a c0895a = (C0895a) obj;
            return epx.f(this.a, c0895a.a) && epx.f(this.b, c0895a.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ActionsHandlers(dialogsActionHandler=" + this.a + ", callsActionHandler=" + this.b + ')';
        }
    }

    /* compiled from: DialogsToolbarDependenciesImpl.kt */
    public static final class b {
        public final o0w a;
        public final iwv b;

        public b(o0w o0wVar, iwv iwvVar) {
            this.a = o0wVar;
            this.b = iwvVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Bridges(dialogsBridge=" + this.a + ", actionBridge=" + this.b + ')';
        }
    }

    public a(a1w a1wVar, b bVar, C0895a c0895a, di3 di3Var, com.vk.dialogtags.api.a aVar, ko8 ko8Var, d7p d7pVar, b1s b1sVar) {
        this.a = a1wVar;
        this.b = bVar;
        this.c = c0895a;
        this.d = aVar;
        this.e = d7pVar;
        this.f = di3Var;
        this.g = ko8Var;
        this.h = d7pVar;
        this.i = b1sVar.a();
    }

    @Override // xsna.gwm
    public final void a(Context context) {
        this.b.a.a(context);
    }

    @Override // xsna.gwm
    public final void b(Context context, UserId userId, String str, String str2, boolean z) {
        this.c.a.b.m(context, userId, new o0r0.a(false, null, null, null, null, str, str2, z, false, false, false, null, null, null, 65311));
    }

    @Override // xsna.gwm
    public final void c() {
        this.c.a.a.a0();
    }

    @Override // xsna.gwm
    public final void d(Context context) {
        this.b.a.S(context, "conversations");
    }

    @Override // xsna.gwm
    public final void e(Context context, SearchMode searchMode) {
        DialogsSearchFragment.a aVar = new DialogsSearchFragment.a(DialogsSearchFragment.class, null, null);
        Peer q = this.a.q();
        Bundle bundle = aVar.j;
        bundle.putSerializable("arg_search_mode", searchMode);
        bundle.putParcelable("owner_id", q);
        aVar.k(context);
    }

    @Override // xsna.gwm
    public final a1w f() {
        return this.a;
    }

    @Override // xsna.gwm
    public final void g() {
        vmm vmmVar = this.c.a;
        if (vmmVar.c.a()) {
            vmmVar.d.invoke().e(vmmVar.a, MultiAccountEntryPoint.LongTap.d);
        }
    }

    @Override // xsna.gwm
    public final void h() {
        this.c.b.a(ImCallAction.GO_TO_CALLS);
    }

    @Override // xsna.gwm
    public final void i(Context context) {
        this.b.b.getClass();
    }
}
