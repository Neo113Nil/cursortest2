package ru.ozon.android.messenger.framework.data.local.database.draft.entity;

import C.o0;
import G.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f87493a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f87494b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AbstractC1573a f87495c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f87496d;

    /* renamed from: e, reason: collision with root package name */
    private final String f87497e;

    /* renamed from: f, reason: collision with root package name */
    private final String f87498f;

    /* renamed from: g, reason: collision with root package name */
    private final Integer f87499g;

    /* renamed from: h, reason: collision with root package name */
    private final Integer f87500h;

    /* renamed from: i, reason: collision with root package name */
    private final String f87501i;

    /* renamed from: j, reason: collision with root package name */
    private final String f87502j;

    /* renamed from: ru.ozon.android.messenger.framework.data.local.database.draft.entity.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1573a {

        /* renamed from: a, reason: collision with root package name */
        private final int f87503a;

        /* renamed from: ru.ozon.android.messenger.framework.data.local.database.draft.entity.a$a$a, reason: collision with other inner class name */
        public static final class C1574a extends AbstractC1573a {

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            public static final C1574a f87504b = new C1574a(1);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1574a);
            }

            public final int hashCode() {
                return -2071850438;
            }

            @NotNull
            public final String toString() {
                return "File";
            }
        }

        /* renamed from: ru.ozon.android.messenger.framework.data.local.database.draft.entity.a$a$b */
        public static final class b extends AbstractC1573a {

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            public static final b f87505b = new b(2);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 200025181;
            }

            @NotNull
            public final String toString() {
                return "Image";
            }
        }

        public AbstractC1573a(int i11) {
            this.f87503a = i11;
        }

        public final int a() {
            return this.f87503a;
        }
    }

    public a(@NotNull String id2, @NotNull String chatId, @NotNull AbstractC1573a type, @NotNull String localUrl, String str, String str2, Integer num, Integer num2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(localUrl, "localUrl");
        this.f87493a = id2;
        this.f87494b = chatId;
        this.f87495c = type;
        this.f87496d = localUrl;
        this.f87497e = str;
        this.f87498f = str2;
        this.f87499g = num;
        this.f87500h = num2;
        this.f87501i = str3;
        this.f87502j = str4;
    }

    @NotNull
    public final String a() {
        return this.f87494b;
    }

    public final String b() {
        return this.f87502j;
    }

    public final String c() {
        return this.f87501i;
    }

    @NotNull
    public final String d() {
        return this.f87493a;
    }

    public final Integer e() {
        return this.f87500h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f87493a, aVar.f87493a) && Intrinsics.d(this.f87494b, aVar.f87494b) && Intrinsics.d(this.f87495c, aVar.f87495c) && Intrinsics.d(this.f87496d, aVar.f87496d) && Intrinsics.d(this.f87497e, aVar.f87497e) && Intrinsics.d(this.f87498f, aVar.f87498f) && Intrinsics.d(this.f87499g, aVar.f87499g) && Intrinsics.d(this.f87500h, aVar.f87500h) && Intrinsics.d(this.f87501i, aVar.f87501i) && Intrinsics.d(this.f87502j, aVar.f87502j);
    }

    public final Integer f() {
        return this.f87499g;
    }

    @NotNull
    public final String g() {
        return this.f87496d;
    }

    public final String h() {
        return this.f87498f;
    }

    public final int hashCode() {
        int a11 = g.a((this.f87495c.hashCode() + g.a(this.f87493a.hashCode() * 31, 31, this.f87494b)) * 31, 31, this.f87496d);
        String str = this.f87497e;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f87498f;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f87499g;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f87500h;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f87501i;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f87502j;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String i() {
        return this.f87497e;
    }

    @NotNull
    public final AbstractC1573a j() {
        return this.f87495c;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DraftAttachmentEntity(id=");
        sb2.append(this.f87493a);
        sb2.append(", chatId=");
        sb2.append(this.f87494b);
        sb2.append(", type=");
        sb2.append(this.f87495c);
        sb2.append(", localUrl=");
        sb2.append(this.f87496d);
        sb2.append(", remoteUrl=");
        sb2.append(this.f87497e);
        sb2.append(", mediaType=");
        sb2.append(this.f87498f);
        sb2.append(", imageWidth=");
        sb2.append(this.f87499g);
        sb2.append(", imageHeight=");
        sb2.append(this.f87500h);
        sb2.append(", filename=");
        sb2.append(this.f87501i);
        sb2.append(", fileSize=");
        return o0.c(sb2, this.f87502j, ")");
    }
}
