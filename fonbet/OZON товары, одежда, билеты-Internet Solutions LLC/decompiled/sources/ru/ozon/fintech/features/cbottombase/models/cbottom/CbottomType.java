package ru.ozon.fintech.features.cbottombase.models.cbottom;

import Xc.a;
import Xc.b;
import androidx.annotation.Keep;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;", "", "versions", "", "", "<init>", "(Ljava/lang/String;ILjava/util/Set;)V", "getVersions", "()Ljava/util/Set;", "SHEET", "SNACK", "MODAL", "STORIES", "ONBOARDING", "WEBVIEW", "FULL", "SCREEN", "PDF", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CbottomType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CbottomType[] $VALUES;
    public static final CbottomType FULL;
    public static final CbottomType MODAL;
    public static final CbottomType ONBOARDING;
    public static final CbottomType PDF;
    public static final CbottomType SCREEN;
    public static final CbottomType SHEET;
    public static final CbottomType SNACK;
    public static final CbottomType STORIES;
    public static final CbottomType WEBVIEW;

    @NotNull
    private final Set<Integer> versions;

    private static final /* synthetic */ CbottomType[] $values() {
        return new CbottomType[]{SHEET, SNACK, MODAL, STORIES, ONBOARDING, WEBVIEW, FULL, SCREEN, PDF};
    }

    static {
        Integer[] elements = {1, 2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        SHEET = new CbottomType("SHEET", 0, C7705l.j0(elements));
        Integer[] elements2 = {1, 2};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        SNACK = new CbottomType("SNACK", 1, C7705l.j0(elements2));
        Integer[] elements3 = {1, 2};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        MODAL = new CbottomType("MODAL", 2, C7705l.j0(elements3));
        Integer[] elements4 = {1, 2};
        Intrinsics.checkNotNullParameter(elements4, "elements");
        STORIES = new CbottomType("STORIES", 3, C7705l.j0(elements4));
        Integer[] elements5 = {1, 2};
        Intrinsics.checkNotNullParameter(elements5, "elements");
        ONBOARDING = new CbottomType("ONBOARDING", 4, C7705l.j0(elements5));
        Integer[] elements6 = {1, 2};
        Intrinsics.checkNotNullParameter(elements6, "elements");
        WEBVIEW = new CbottomType("WEBVIEW", 5, C7705l.j0(elements6));
        Integer[] elements7 = {1, 2};
        Intrinsics.checkNotNullParameter(elements7, "elements");
        FULL = new CbottomType("FULL", 6, C7705l.j0(elements7));
        Integer[] elements8 = {1, 2};
        Intrinsics.checkNotNullParameter(elements8, "elements");
        SCREEN = new CbottomType("SCREEN", 7, C7705l.j0(elements8));
        Integer[] elements9 = {1, 2};
        Intrinsics.checkNotNullParameter(elements9, "elements");
        PDF = new CbottomType("PDF", 8, C7705l.j0(elements9));
        CbottomType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private CbottomType(String str, int i11, Set set) {
        this.versions = set;
    }

    @NotNull
    public static a<CbottomType> getEntries() {
        return $ENTRIES;
    }

    public static CbottomType valueOf(String str) {
        return (CbottomType) Enum.valueOf(CbottomType.class, str);
    }

    public static CbottomType[] values() {
        return (CbottomType[]) $VALUES.clone();
    }

    @NotNull
    public final Set<Integer> getVersions() {
        return this.versions;
    }
}
