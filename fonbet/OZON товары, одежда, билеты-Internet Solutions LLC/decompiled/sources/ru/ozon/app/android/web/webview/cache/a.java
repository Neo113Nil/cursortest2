package ru.ozon.app.android.web.webview.cache;

import kotlin.jvm.functions.Function1;
import qc.g;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f94594a;

    public /* synthetic */ a(Function1 function1) {
        this.f94594a = function1;
    }

    @Override // qc.g
    public final void accept(Object obj) {
        this.f94594a.invoke(obj);
    }
}
