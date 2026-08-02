package ru.ozon.android.messenger.framework.data.requests;

import B0.C2454a;
import Kk.C3532b;
import T7.P;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b extends e {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f88650c;

    /* renamed from: d, reason: collision with root package name */
    private final String f88651d;

    /* renamed from: e, reason: collision with root package name */
    private final int f88652e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final a f88653f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f88654g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f88655h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, String> f88656i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f88657j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f88658k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a BACKWARD;
        public static final a BACK_AND_FORTH;
        public static final a FORWARD;

        @NotNull
        private final String dtoName;

        static {
            a aVar = new a("FORWARD", 0, "Forward");
            FORWARD = aVar;
            a aVar2 = new a("BACKWARD", 1, "Backward");
            BACKWARD = aVar2;
            a aVar3 = new a("BACK_AND_FORTH", 2, "BackAndForth");
            BACK_AND_FORTH = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a(String str, int i11, String str2) {
            this.dtoName = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @NotNull
        public final String a() {
            return this.dtoName;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull String chatId, String str, @NotNull a direction, boolean z11, boolean z12, Map map, @NotNull Map additionalParams) {
        super(d.GET_MESSAGES, chatId, 4);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(additionalParams, "additionalParams");
        this.f88650c = chatId;
        this.f88651d = str;
        this.f88652e = 40;
        this.f88653f = direction;
        this.f88654g = z11;
        this.f88655h = z12;
        this.f88656i = map;
        this.f88657j = additionalParams;
        Tc.d builder = new Tc.d();
        builder.put("chatId", chatId);
        builder.put("messageId", str);
        builder.put("limit", 40);
        builder.put("direction", direction.a());
        builder.put("includeSelf", Boolean.valueOf(z11));
        builder.put("withFirstPageInfo", Boolean.valueOf(z12));
        if (map != null && !map.isEmpty()) {
            builder.put("context", map);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f88658k = U.m(builder.u(), additionalParams);
    }

    @Override // ru.ozon.android.messenger.framework.data.requests.e
    @NotNull
    public final Map<String, Object> b() {
        return this.f88658k;
    }

    @NotNull
    public final String d() {
        return this.f88650c;
    }

    @NotNull
    public final a e() {
        return this.f88653f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f88650c, bVar.f88650c) && Intrinsics.d(this.f88651d, bVar.f88651d) && this.f88652e == bVar.f88652e && this.f88653f == bVar.f88653f && this.f88654g == bVar.f88654g && this.f88655h == bVar.f88655h && Intrinsics.d(this.f88656i, bVar.f88656i) && Intrinsics.d(this.f88657j, bVar.f88657j);
    }

    public final boolean f() {
        return this.f88654g;
    }

    public final int g() {
        return this.f88652e;
    }

    public final String h() {
        return this.f88651d;
    }

    public final int hashCode() {
        int hashCode = this.f88650c.hashCode() * 31;
        String str = this.f88651d;
        int a11 = C3532b.a(C3532b.a((this.f88653f.hashCode() + C2454a.a(this.f88652e, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31, this.f88654g), 31, this.f88655h);
        Map<String, String> map = this.f88656i;
        return this.f88657j.hashCode() + ((a11 + (map != null ? map.hashCode() : 0)) * 31);
    }

    public final boolean i() {
        return this.f88655h;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GetMessagesRequest(chatId=");
        sb2.append(this.f88650c);
        sb2.append(", messageId=");
        sb2.append(this.f88651d);
        sb2.append(", limit=");
        sb2.append(this.f88652e);
        sb2.append(", direction=");
        sb2.append(this.f88653f);
        sb2.append(", includeSelf=");
        sb2.append(this.f88654g);
        sb2.append(", withFirstPageInfo=");
        sb2.append(this.f88655h);
        sb2.append(", context=");
        sb2.append(this.f88656i);
        sb2.append(", additionalParams=");
        return P.f(sb2, this.f88657j, ")");
    }
}
