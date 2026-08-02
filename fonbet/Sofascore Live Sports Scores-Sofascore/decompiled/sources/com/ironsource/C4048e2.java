package com.ironsource;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.e2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4048e2 {

    @Nullable
    private List<String> a = new ArrayList();

    @Nullable
    private List<String> b = new ArrayList();

    @Nullable
    private List<String> c = new ArrayList();

    @Nullable
    public final List<String> a() {
        return this.c;
    }

    @Nullable
    public final List<String> b() {
        return this.b;
    }

    @Nullable
    public final List<String> c() {
        return this.a;
    }

    public final void a(@Nullable List<String> list) {
        this.c = list;
    }

    public final void b(@Nullable List<String> list) {
        this.b = list;
    }

    public final void c(@Nullable List<String> list) {
        this.a = list;
    }
}
