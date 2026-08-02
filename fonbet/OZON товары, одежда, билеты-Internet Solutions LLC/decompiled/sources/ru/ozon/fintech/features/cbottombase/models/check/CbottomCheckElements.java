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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B#\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/check/CbottomCheckElements;", "", "type", "", "elements", "", "Lru/ozon/fintech/features/cbottombase/models/check/CbottomCheckElements$CbottomElementTypes;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getType", "()Ljava/lang/String;", "getElements", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "CbottomElementTypes", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CbottomCheckElements {

    @NotNull
    private final List<CbottomElementTypes> elements;
    private final String type;

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/check/CbottomCheckElements$CbottomElementTypes;", "", "type", "", "<init>", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class CbottomElementTypes {

        @NotNull
        private final String type;

        public CbottomElementTypes(@i(name = "type") @NotNull String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
        }

        public static /* synthetic */ CbottomElementTypes copy$default(CbottomElementTypes cbottomElementTypes, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = cbottomElementTypes.type;
            }
            return cbottomElementTypes.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final CbottomElementTypes copy(@i(name = "type") @NotNull String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new CbottomElementTypes(type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CbottomElementTypes) && Intrinsics.d(this.type, ((CbottomElementTypes) other).type);
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
            return A0.b("CbottomElementTypes(type=", this.type, ")");
        }
    }

    public CbottomCheckElements(@i(name = "type") String str, @i(name = "main") @NotNull List<CbottomElementTypes> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.type = str;
        this.elements = elements;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CbottomCheckElements copy$default(CbottomCheckElements cbottomCheckElements, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cbottomCheckElements.type;
        }
        if ((i11 & 2) != 0) {
            list = cbottomCheckElements.elements;
        }
        return cbottomCheckElements.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final List<CbottomElementTypes> component2() {
        return this.elements;
    }

    @NotNull
    public final CbottomCheckElements copy(@i(name = "type") String type, @i(name = "main") @NotNull List<CbottomElementTypes> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CbottomCheckElements(type, elements);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CbottomCheckElements)) {
            return false;
        }
        CbottomCheckElements cbottomCheckElements = (CbottomCheckElements) other;
        return Intrinsics.d(this.type, cbottomCheckElements.type) && Intrinsics.d(this.elements, cbottomCheckElements.elements);
    }

    @NotNull
    public final List<CbottomElementTypes> getElements() {
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
        return C2439a.a("CbottomCheckElements(type=", this.type, ", elements=", ")", this.elements);
    }
}
