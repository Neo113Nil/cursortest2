package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import defpackage.dmi;
import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4009c implements InterfaceC4033d5<JSONObject> {

    @NotNull
    private final V5 a;

    @NotNull
    private final String b;

    @NotNull
    private final InterfaceC4357v7 c;

    @NotNull
    private final Function1<w2g, Unit> d;

    @NotNull
    private C4376w8 e;

    /* JADX WARN: Multi-variable type inference failed */
    public C4009c(@NotNull V5 v5, @NotNull String str, @NotNull InterfaceC4357v7 interfaceC4357v7, @NotNull Function1<? super w2g, Unit> function1) {
        v5.getClass();
        str.getClass();
        interfaceC4357v7.getClass();
        function1.getClass();
        this.a = v5;
        this.b = str;
        this.c = interfaceC4357v7;
        this.d = function1;
        this.e = new C4376w8(c(), U3.i);
    }

    private final JSONObject c(C4376w8 c4376w8) {
        return new JSONObject(IronSourceStorageUtils.readFile(c4376w8));
    }

    @Override // com.ironsource.Nc
    public void a(@NotNull C4376w8 c4376w8) {
        c4376w8.getClass();
        if (Intrinsics.c(c4376w8.getName(), U3.i)) {
            try {
                i().invoke(new w2g(c(c4376w8)));
            } catch (Exception e) {
                C4157k4.d().a(e);
                Function1<w2g, Unit> i = i();
                p2g p2gVar = w2g.b;
                i.invoke(new w2g(new u2g(e)));
            }
        }
    }

    @Override // com.ironsource.InterfaceC4033d5
    public void b(@NotNull C4376w8 c4376w8) {
        c4376w8.getClass();
        this.e = c4376w8;
    }

    @Override // com.ironsource.InterfaceC4033d5
    @NotNull
    public V5 d() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC4033d5
    @NotNull
    public Function1<w2g, Unit> i() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC4033d5
    @NotNull
    public C4376w8 k() {
        return this.e;
    }

    @Override // com.ironsource.InterfaceC4033d5
    @NotNull
    public InterfaceC4357v7 l() {
        return this.c;
    }

    @Override // com.ironsource.InterfaceC4033d5
    @NotNull
    public String c() {
        return this.b;
    }

    @Override // com.ironsource.Nc
    public void a(@Nullable C4376w8 c4376w8, @NotNull C4215n8 c4215n8) {
        c4215n8.getClass();
        Function1<w2g, Unit> i = i();
        p2g p2gVar = w2g.b;
        i.invoke(new w2g(new u2g(new Exception(dmi.q("Unable to download abTestMap.json: ", c4215n8.b())))));
    }
}
