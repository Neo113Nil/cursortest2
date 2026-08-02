package ru.ozon.fintech.features.cbottombase.models.check;

import An.C2439a;
import B0.A0;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B#\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/check/CbottomCheckElements2;", "", "type", "", "elements", "", "Lru/ozon/fintech/features/cbottombase/models/check/CbottomCheckElements2$CbottomElementTypes2;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getType", "()Ljava/lang/String;", "getElements", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "CbottomElementTypes2", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CbottomCheckElements2 {

    @NotNull
    private final List<CbottomElementTypes2> elements;
    private final String type;

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/check/CbottomCheckElements2$CbottomElementTypes2;", "", "type", "", "<init>", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class CbottomElementTypes2 {

        @NotNull
        private final String type;

        public CbottomElementTypes2(@i(name = "type") @NotNull String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
        }

        public static /* synthetic */ CbottomElementTypes2 copy$default(CbottomElementTypes2 cbottomElementTypes2, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = cbottomElementTypes2.type;
            }
            return cbottomElementTypes2.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final CbottomElementTypes2 copy(@i(name = "type") @NotNull String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new CbottomElementTypes2(type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CbottomElementTypes2) && Intrinsics.d(this.type, ((CbottomElementTypes2) other).type);
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("CbottomElementTypes2(type=", this.type, ")");
        }
    }

    public CbottomCheckElements2(@i(name = "type") String str, @i(name = "main") @NotNull List<CbottomElementTypes2> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.type = str;
        this.elements = elements;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CbottomCheckElements2 copy$default(CbottomCheckElements2 cbottomCheckElements2, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cbottomCheckElements2.type;
        }
        if ((i11 & 2) != 0) {
            list = cbottomCheckElements2.elements;
        }
        return cbottomCheckElements2.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final List<CbottomElementTypes2> component2() {
        return this.elements;
    }

    @NotNull
    public final CbottomCheckElements2 copy(@i(name = "type") String type, @i(name = "main") @NotNull List<CbottomElementTypes2> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CbottomCheckElements2(type, elements);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CbottomCheckElements2)) {
            return false;
        }
        CbottomCheckElements2 cbottomCheckElements2 = (CbottomCheckElements2) other;
        return Intrinsics.d(this.type, cbottomCheckElements2.type) && Intrinsics.d(this.elements, cbottomCheckElements2.elements);
    }

    @NotNull
    public final List<CbottomElementTypes2> getElements() {
        return this.elements;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        return this.elements.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return C2439a.a("CbottomCheckElements2(type=", this.type, ", elements=", ")", this.elements);
    }
}
