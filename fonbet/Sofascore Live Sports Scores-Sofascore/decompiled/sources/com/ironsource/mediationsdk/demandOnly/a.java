package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.C4227o2;
import defpackage.dmi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface a {
    @Nullable
    C4227o2 a(@NotNull String str);

    @NotNull
    List<C4227o2> a();

    @NotNull
    String b();

    @Nullable
    C4227o2 get(int i);

    boolean isEmpty();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.mediationsdk.demandOnly.a$a, reason: collision with other inner class name */
    public static final class C1208a implements a {

        @NotNull
        private final List<C4227o2> a;

        public /* synthetic */ C1208a(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new ArrayList() : list);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        @Nullable
        public C4227o2 a(@NotNull String str) {
            Object obj;
            str.getClass();
            Iterator<T> it = this.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.c(((C4227o2) obj).c(), str)) {
                    break;
                }
            }
            return (C4227o2) obj;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        @NotNull
        public String b() {
            return this.a.isEmpty() ? "" : dmi.q("1", ((C4227o2) CollectionsKt.Y(this.a)).c());
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        @Nullable
        public C4227o2 get(int i) {
            if (i < 0 || i >= this.a.size()) {
                return null;
            }
            return this.a.get(i);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        public C1208a(@NotNull List<C4227o2> list) {
            list.getClass();
            this.a = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C1208a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        @NotNull
        public List<C4227o2> a() {
            return this.a;
        }
    }
}
