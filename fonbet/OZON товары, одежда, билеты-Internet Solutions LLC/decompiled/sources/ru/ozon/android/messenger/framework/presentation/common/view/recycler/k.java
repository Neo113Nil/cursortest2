package ru.ozon.android.messenger.framework.presentation.common.view.recycler;

import android.content.Context;
import android.view.ViewGroup;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class k extends ru.ozon.android.messenger.framework.presentation.common.view.recycler.lifecycle.a {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f91242g = 0;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ViewGroup f91243b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.d f91244c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C9512c f91245d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final HashMap<Integer, List<q<ru.ozon.android.messenger.framework.presentation.models.g, X4.a>>> f91246e;

    /* renamed from: f, reason: collision with root package name */
    private ru.ozon.android.messenger.framework.presentation.models.q f91247f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@NotNull ViewGroup containerView, @NotNull ru.ozon.android.messenger.framework.core.d references, @NotNull C9512c blockCache) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(blockCache, "blockCache");
        this.f91243b = containerView;
        this.f91244c = references;
        this.f91245d = blockCache;
        this.f91246e = new HashMap<>();
    }

    public void e(@NotNull ru.ozon.android.messenger.framework.presentation.models.q item) {
        Intrinsics.checkNotNullParameter(item, "item");
    }

    public void f(@NotNull ru.ozon.android.messenger.framework.presentation.models.q item, Object obj) {
        Intrinsics.checkNotNullParameter(item, "item");
    }

    protected final void g(@NotNull ViewGroup blockContainer, @NotNull ru.ozon.android.messenger.framework.presentation.models.q item) {
        Intrinsics.checkNotNullParameter(blockContainer, "blockContainer");
        Intrinsics.checkNotNullParameter(item, "item");
        this.f91247f = item;
        blockContainer.removeAllViews();
        for (ru.ozon.android.messenger.framework.presentation.models.u uVar : item.b()) {
            q<ru.ozon.android.messenger.framework.presentation.models.g, X4.a> a11 = this.f91245d.a(uVar.e());
            if (a11 != null) {
                blockContainer.addView(a11.getBinding().getConstraintLayout());
                a11.bind(uVar.c(), item.c(), uVar.b(), null);
            } else {
                ru.ozon.android.messenger.framework.core.d dVar = this.f91244c;
                ArrayList b11 = ru.ozon.android.messenger.framework.data.d.b(dVar.a(), uVar.e());
                ArrayList arrayList = new ArrayList();
                for (Object obj : b11) {
                    ru.ozon.android.messenger.framework.presentation.models.p newItemInfo = item.c();
                    Intrinsics.checkNotNullParameter(uVar, "<this>");
                    Intrinsics.checkNotNullParameter(newItemInfo, "newItemInfo");
                    if (((ru.ozon.android.messenger.framework.core.viewmapper.a) obj).canMap(new ru.ozon.android.messenger.framework.presentation.models.e(uVar.c(), uVar.e(), uVar.d(), newItemInfo, uVar.b()))) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ru.ozon.android.messenger.framework.core.viewmapper.a aVar = (ru.ozon.android.messenger.framework.core.viewmapper.a) it.next();
                    InterfaceC6511n inflate = aVar.getInflate();
                    Context context = this.f91243b.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    X4.a aVar2 = (X4.a) inflate.invoke(ru.ozon.android.messenger.utils.c.c(context), blockContainer, Boolean.FALSE);
                    blockContainer.addView(aVar2.getConstraintLayout());
                    q<ru.ozon.android.messenger.framework.presentation.models.g, X4.a> qVar = (q) aVar.getViewProducer().invoke(aVar2, dVar);
                    int e11 = uVar.e();
                    HashMap<Integer, List<q<ru.ozon.android.messenger.framework.presentation.models.g, X4.a>>> hashMap = this.f91246e;
                    List<q<ru.ozon.android.messenger.framework.presentation.models.g, X4.a>> list = hashMap.get(Integer.valueOf(e11));
                    if (list != null) {
                        list.add(qVar);
                    } else {
                        hashMap.put(Integer.valueOf(e11), C7714v.m0(qVar));
                    }
                    qVar.bind(uVar.c(), item.c(), uVar.b(), null);
                }
            }
        }
    }

    public void h() {
    }

    protected final ru.ozon.android.messenger.framework.presentation.models.q i() {
        return this.f91247f;
    }

    @NotNull
    protected final HashMap<Integer, List<q<ru.ozon.android.messenger.framework.presentation.models.g, X4.a>>> j() {
        return this.f91246e;
    }

    @NotNull
    protected final ru.ozon.android.messenger.framework.core.d k() {
        return this.f91244c;
    }
}
