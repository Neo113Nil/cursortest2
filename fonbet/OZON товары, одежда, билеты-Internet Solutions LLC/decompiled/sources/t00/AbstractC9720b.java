package t00;

import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p00.InterfaceC8826b;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

/* renamed from: t00.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9720b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f98950a;

    /* renamed from: t00.b$a */
    public static final class a extends AbstractC9720b {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f98951b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f98952c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String argumentName, boolean z11) {
            super(c.BOOLEAN_ARGUMENT_ITEM);
            Intrinsics.checkNotNullParameter(argumentName, "argumentName");
            this.f98951b = argumentName;
            this.f98952c = z11;
        }

        @NotNull
        public final String b() {
            return this.f98951b;
        }

        public final boolean c() {
            return this.f98952c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f98951b, aVar.f98951b) && this.f98952c == aVar.f98952c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f98952c) + (this.f98951b.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BooleanArgumentItem(argumentName=");
            sb2.append(this.f98951b);
            sb2.append(", argumentValue=");
            return Pk0.a.a(")", sb2, this.f98952c);
        }
    }

    /* renamed from: t00.b$b, reason: collision with other inner class name */
    public static final class C2174b extends AbstractC9720b {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final CellDTO f98953b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f98954c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final InterfaceC8826b.a f98955d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2174b(@NotNull CellDTO cellDTO, boolean z11, @NotNull InterfaceC8826b.a flagInfo) {
            super(c.BOOLEAN_ITEM);
            Intrinsics.checkNotNullParameter(cellDTO, "cellDTO");
            Intrinsics.checkNotNullParameter(flagInfo, "flagInfo");
            this.f98953b = cellDTO;
            this.f98954c = z11;
            this.f98955d = flagInfo;
        }

        @NotNull
        public final CellDTO b() {
            return this.f98953b;
        }

        @NotNull
        public final InterfaceC8826b.a c() {
            return this.f98955d;
        }

        public final boolean d() {
            return this.f98954c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2174b)) {
                return false;
            }
            C2174b c2174b = (C2174b) obj;
            return Intrinsics.d(this.f98953b, c2174b.f98953b) && this.f98954c == c2174b.f98954c && Intrinsics.d(this.f98955d, c2174b.f98955d);
        }

        public final int hashCode() {
            return this.f98955d.hashCode() + C3532b.a(this.f98953b.hashCode() * 31, 31, this.f98954c);
        }

        @NotNull
        public final String toString() {
            return "BooleanItem(cellDTO=" + this.f98953b + ", value=" + this.f98954c + ", flagInfo=" + this.f98955d + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: t00.b$c */
    public static final class c {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c BOOLEAN_ARGUMENT_ITEM;
        public static final c BOOLEAN_ITEM;
        public static final c STRING_ITEM;

        static {
            c cVar = new c("BOOLEAN_ITEM", 0);
            BOOLEAN_ITEM = cVar;
            c cVar2 = new c("STRING_ITEM", 1);
            STRING_ITEM = cVar2;
            c cVar3 = new c("BOOLEAN_ARGUMENT_ITEM", 2);
            BOOLEAN_ARGUMENT_ITEM = cVar3;
            c[] cVarArr = {cVar, cVar2, cVar3};
            $VALUES = cVarArr;
            $ENTRIES = Xc.b.a(cVarArr);
        }

        private c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* renamed from: t00.b$d */
    public static final class d extends AbstractC9720b {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f98956b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final IconButtonV3DTO f98957c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final InterfaceC8826b.AbstractC1343b f98958d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull String value, @NotNull IconButtonV3DTO iconButton, @NotNull InterfaceC8826b.AbstractC1343b flagInfo) {
            super(c.STRING_ITEM);
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(iconButton, "iconButton");
            Intrinsics.checkNotNullParameter(flagInfo, "flagInfo");
            this.f98956b = value;
            this.f98957c = iconButton;
            this.f98958d = flagInfo;
        }

        @NotNull
        public final InterfaceC8826b.AbstractC1343b b() {
            return this.f98958d;
        }

        @NotNull
        public final IconButtonV3DTO c() {
            return this.f98957c;
        }

        @NotNull
        public final String d() {
            return this.f98956b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.d(this.f98956b, dVar.f98956b) && Intrinsics.d(this.f98957c, dVar.f98957c) && Intrinsics.d(this.f98958d, dVar.f98958d);
        }

        public final int hashCode() {
            return this.f98958d.hashCode() + GR.b.c(this.f98957c, this.f98956b.hashCode() * 31, 31);
        }

        @NotNull
        public final String toString() {
            return "StringItem(value=" + this.f98956b + ", iconButton=" + this.f98957c + ", flagInfo=" + this.f98958d + ")";
        }
    }

    public AbstractC9720b(c cVar) {
        this.f98950a = cVar;
    }

    @NotNull
    public final c a() {
        return this.f98950a;
    }
}
