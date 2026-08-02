package ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesCell.presentation;

import A00.a;
import B90.C2618u;
import ed.InterfaceC6346b;
import kotlin.Metadata;

@InterfaceC6346b
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0003\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/presentation/AddToFavoritesUpdate;", "LA00/a$J$a;", "", "isFavorite", "constructor-impl", "(Z)Z", "", "toString-impl", "(Z)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Z)I", "hashCode", "", "other", "equals-impl", "(ZLjava/lang/Object;)Z", "equals", "Z", "()Z", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AddToFavoritesUpdate implements a.J.InterfaceC0007a {
    private final boolean isFavorite;

    private /* synthetic */ AddToFavoritesUpdate(boolean z11) {
        this.isFavorite = z11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AddToFavoritesUpdate m1056boximpl(boolean z11) {
        return new AddToFavoritesUpdate(z11);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static boolean m1057constructorimpl(boolean z11) {
        return z11;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1058equalsimpl(boolean z11, Object obj) {
        return (obj instanceof AddToFavoritesUpdate) && z11 == ((AddToFavoritesUpdate) obj).getIsFavorite();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1059hashCodeimpl(boolean z11) {
        return Boolean.hashCode(z11);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1060toStringimpl(boolean z11) {
        return C2618u.g("AddToFavoritesUpdate(isFavorite=", ")", z11);
    }

    public boolean equals(Object obj) {
        return m1058equalsimpl(this.isFavorite, obj);
    }

    public int hashCode() {
        return m1059hashCodeimpl(this.isFavorite);
    }

    public String toString() {
        return m1060toStringimpl(this.isFavorite);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ boolean getIsFavorite() {
        return this.isFavorite;
    }
}
