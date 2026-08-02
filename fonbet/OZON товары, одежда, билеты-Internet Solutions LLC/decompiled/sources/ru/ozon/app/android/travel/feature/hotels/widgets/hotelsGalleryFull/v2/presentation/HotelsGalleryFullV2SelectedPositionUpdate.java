package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation;

import A00.a;
import T7.E;
import ed.InterfaceC6346b;
import kotlin.Metadata;

@InterfaceC6346b
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2SelectedPositionUpdate;", "LA00/a$J$a;", "", "newSelectedPosition", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "I", "getNewSelectedPosition", "()I", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFullV2SelectedPositionUpdate implements a.J.InterfaceC0007a {
    private final int newSelectedPosition;

    private /* synthetic */ HotelsGalleryFullV2SelectedPositionUpdate(int i11) {
        this.newSelectedPosition = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ HotelsGalleryFullV2SelectedPositionUpdate m1395boximpl(int i11) {
        return new HotelsGalleryFullV2SelectedPositionUpdate(i11);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1396constructorimpl(int i11) {
        return i11;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1397equalsimpl(int i11, Object obj) {
        return (obj instanceof HotelsGalleryFullV2SelectedPositionUpdate) && i11 == ((HotelsGalleryFullV2SelectedPositionUpdate) obj).getNewSelectedPosition();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1398hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1399toStringimpl(int i11) {
        return E.a(i11, "HotelsGalleryFullV2SelectedPositionUpdate(newSelectedPosition=", ")");
    }

    public boolean equals(Object obj) {
        return m1397equalsimpl(this.newSelectedPosition, obj);
    }

    public int hashCode() {
        return m1398hashCodeimpl(this.newSelectedPosition);
    }

    public String toString() {
        return m1399toStringimpl(this.newSelectedPosition);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getNewSelectedPosition() {
        return this.newSelectedPosition;
    }
}
