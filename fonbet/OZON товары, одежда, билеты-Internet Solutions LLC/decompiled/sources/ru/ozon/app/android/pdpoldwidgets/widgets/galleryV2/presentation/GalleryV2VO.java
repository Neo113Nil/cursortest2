package ru.ozon.app.android.pdpoldwidgets.widgets.galleryV2.presentation;

import Ak.C2436a;
import B3.p;
import B90.C2618u;
import D3.g;
import De.C2860c;
import Kk.C3532b;
import Lh.b;
import N3.C3660k;
import Pk0.f;
import WZ.t;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b \b\u0086\b\u0018\u00002\u00020\u0001:\u000489:;B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b(\u0010'R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b)\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b\u000e\u0010.R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b2\u00101R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0012\u0010-\u001a\u0004\b\u0012\u0010.R\u0017\u0010\u0013\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b\u0013\u0010.R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u00106\u001a\u0004\b7\u0010\u001b¨\u0006<"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2VO;", "", "", "id", "", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2VO$GalleryItem;", "items", "Lru/ozon/uni/atoms/data/badge/Badge;", "badges", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;", "buttons", "", "ratio", "", "isBorderless", "LWZ/t;", "galleryTokenizedEvent", "popupTokenizedEvent", "isEmptyGallery", "isClassified", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2VO$ClassifiedInfoVO;", "classifiedInfo", "", "backgroundColor", "<init>", "(JLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;ZLWZ/t;LWZ/t;ZZLru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2VO$ClassifiedInfoVO;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getBadges", "getButtons", "Ljava/lang/Float;", "getRatio", "()Ljava/lang/Float;", "Z", "()Z", "LWZ/t;", "getGalleryTokenizedEvent", "()LWZ/t;", "getPopupTokenizedEvent", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2VO$ClassifiedInfoVO;", "getClassifiedInfo", "()Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2VO$ClassifiedInfoVO;", "Ljava/lang/String;", "getBackgroundColor", "GalleryItem", "ClassifiedInfoVO", "ImageGalleryItem", "Photo360Item", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GalleryV2VO {
    private final String backgroundColor;
    private final List<Badge> badges;
    private final List<ButtonV3Atom.LargeIconButton> buttons;
    private final ClassifiedInfoVO classifiedInfo;
    private final t galleryTokenizedEvent;
    private final long id;
    private final boolean isBorderless;
    private final boolean isClassified;
    private final boolean isEmptyGallery;

    @NotNull
    private final List<GalleryItem> items;
    private final t popupTokenizedEvent;
    private final Float ratio;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2VO$ClassifiedInfoVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "classifiedText", "", "backgroundColor", "", "backgroundAlpha", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/Float;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getClassifiedText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getBackgroundColor", "Ljava/lang/Float;", "getBackgroundAlpha", "()Ljava/lang/Float;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ClassifiedInfoVO {
        private final Float backgroundAlpha;
        private final String backgroundColor;
        private final TextDTO classifiedText;

        public ClassifiedInfoVO(TextDTO textDTO, String str, Float f7) {
            this.classifiedText = textDTO;
            this.backgroundColor = str;
            this.backgroundAlpha = f7;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ClassifiedInfoVO)) {
                return false;
            }
            ClassifiedInfoVO classifiedInfoVO = (ClassifiedInfoVO) other;
            return Intrinsics.d(this.classifiedText, classifiedInfoVO.classifiedText) && Intrinsics.d(this.backgroundColor, classifiedInfoVO.backgroundColor) && Intrinsics.d(this.backgroundAlpha, classifiedInfoVO.backgroundAlpha);
        }

        public final Float getBackgroundAlpha() {
            return this.backgroundAlpha;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final TextDTO getClassifiedText() {
            return this.classifiedText;
        }

        public int hashCode() {
            TextDTO textDTO = this.classifiedText;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            String str = this.backgroundColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Float f7 = this.backgroundAlpha;
            return hashCode2 + (f7 != null ? f7.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.classifiedText;
            String str = this.backgroundColor;
            Float f7 = this.backgroundAlpha;
            StringBuilder f11 = g.f("ClassifiedInfoVO(classifiedText=", textDTO, ", backgroundColor=", str, ", backgroundAlpha=");
            f11.append(f7);
            f11.append(")");
            return f11.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2VO$GalleryItem;", "Landroid/os/Parcelable;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface GalleryItem extends Parcelable {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GalleryV2VO(long j11, @NotNull List<? extends GalleryItem> items, List<Badge> list, List<ButtonV3Atom.LargeIconButton> list2, Float f7, boolean z11, t tVar, t tVar2, boolean z12, boolean z13, ClassifiedInfoVO classifiedInfoVO, String str) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.id = j11;
        this.items = items;
        this.badges = list;
        this.buttons = list2;
        this.ratio = f7;
        this.isBorderless = z11;
        this.galleryTokenizedEvent = tVar;
        this.popupTokenizedEvent = tVar2;
        this.isEmptyGallery = z12;
        this.isClassified = z13;
        this.classifiedInfo = classifiedInfoVO;
        this.backgroundColor = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GalleryV2VO)) {
            return false;
        }
        GalleryV2VO galleryV2VO = (GalleryV2VO) other;
        return this.id == galleryV2VO.id && Intrinsics.d(this.items, galleryV2VO.items) && Intrinsics.d(this.badges, galleryV2VO.badges) && Intrinsics.d(this.buttons, galleryV2VO.buttons) && Intrinsics.d(this.ratio, galleryV2VO.ratio) && this.isBorderless == galleryV2VO.isBorderless && Intrinsics.d(this.galleryTokenizedEvent, galleryV2VO.galleryTokenizedEvent) && Intrinsics.d(this.popupTokenizedEvent, galleryV2VO.popupTokenizedEvent) && this.isEmptyGallery == galleryV2VO.isEmptyGallery && this.isClassified == galleryV2VO.isClassified && Intrinsics.d(this.classifiedInfo, galleryV2VO.classifiedInfo) && Intrinsics.d(this.backgroundColor, galleryV2VO.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<Badge> getBadges() {
        return this.badges;
    }

    public final List<ButtonV3Atom.LargeIconButton> getButtons() {
        return this.buttons;
    }

    public final ClassifiedInfoVO getClassifiedInfo() {
        return this.classifiedInfo;
    }

    public final t getGalleryTokenizedEvent() {
        return this.galleryTokenizedEvent;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final List<GalleryItem> getItems() {
        return this.items;
    }

    public final t getPopupTokenizedEvent() {
        return this.popupTokenizedEvent;
    }

    public final Float getRatio() {
        return this.ratio;
    }

    public int hashCode() {
        int b11 = G.g.b(Long.hashCode(this.id) * 31, 31, this.items);
        List<Badge> list = this.badges;
        int hashCode = (b11 + (list == null ? 0 : list.hashCode())) * 31;
        List<ButtonV3Atom.LargeIconButton> list2 = this.buttons;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Float f7 = this.ratio;
        int a11 = C3532b.a((hashCode2 + (f7 == null ? 0 : f7.hashCode())) * 31, 31, this.isBorderless);
        t tVar = this.galleryTokenizedEvent;
        int hashCode3 = (a11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        t tVar2 = this.popupTokenizedEvent;
        int a12 = C3532b.a(C3532b.a((hashCode3 + (tVar2 == null ? 0 : tVar2.hashCode())) * 31, 31, this.isEmptyGallery), 31, this.isClassified);
        ClassifiedInfoVO classifiedInfoVO = this.classifiedInfo;
        int hashCode4 = (a12 + (classifiedInfoVO == null ? 0 : classifiedInfoVO.hashCode())) * 31;
        String str = this.backgroundColor;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    /* renamed from: isClassified, reason: from getter */
    public final boolean getIsClassified() {
        return this.isClassified;
    }

    /* renamed from: isEmptyGallery, reason: from getter */
    public final boolean getIsEmptyGallery() {
        return this.isEmptyGallery;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<GalleryItem> list = this.items;
        List<Badge> list2 = this.badges;
        List<ButtonV3Atom.LargeIconButton> list3 = this.buttons;
        Float f7 = this.ratio;
        boolean z11 = this.isBorderless;
        t tVar = this.galleryTokenizedEvent;
        t tVar2 = this.popupTokenizedEvent;
        boolean z12 = this.isEmptyGallery;
        boolean z13 = this.isClassified;
        ClassifiedInfoVO classifiedInfoVO = this.classifiedInfo;
        String str = this.backgroundColor;
        StringBuilder b11 = b.b(j11, "GalleryV2VO(id=", ", items=", list);
        C2860c.g(", badges=", ", buttons=", b11, list2, list3);
        b11.append(", ratio=");
        b11.append(f7);
        b11.append(", isBorderless=");
        b11.append(z11);
        p.d(b11, ", galleryTokenizedEvent=", tVar, ", popupTokenizedEvent=", tVar2);
        C2436a.e(", isEmptyGallery=", ", isClassified=", b11, z12, z13);
        b11.append(", classifiedInfo=");
        b11.append(classifiedInfoVO);
        b11.append(", backgroundColor=");
        b11.append(str);
        b11.append(")");
        return b11.toString();
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2VO$Photo360Item;", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2VO$GalleryItem;", "", "imageUrl", "previewImageUrl", "description", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "button", "LWZ/t;", "buttonEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;LWZ/t;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImageUrl", "getPreviewImageUrl", "getDescription", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "LWZ/t;", "getButtonEvent", "()LWZ/t;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Photo360Item implements GalleryItem {

        @NotNull
        public static final Parcelable.Creator<Photo360Item> CREATOR = new Creator();

        @NotNull
        private final ButtonV3Atom.SmallButton button;
        private final t buttonEvent;

        @NotNull
        private final String description;

        @NotNull
        private final String imageUrl;
        private final String previewImageUrl;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Photo360Item> {
            @Override // android.os.Parcelable.Creator
            public final Photo360Item createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Photo360Item(parcel.readString(), parcel.readString(), parcel.readString(), (ButtonV3Atom.SmallButton) parcel.readParcelable(Photo360Item.class.getClassLoader()), (t) parcel.readParcelable(Photo360Item.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Photo360Item[] newArray(int i11) {
                return new Photo360Item[i11];
            }
        }

        public Photo360Item(@NotNull String imageUrl, String str, @NotNull String description, @NotNull ButtonV3Atom.SmallButton button, t tVar) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(button, "button");
            this.imageUrl = imageUrl;
            this.previewImageUrl = str;
            this.description = description;
            this.button = button;
            this.buttonEvent = tVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Photo360Item)) {
                return false;
            }
            Photo360Item photo360Item = (Photo360Item) other;
            return Intrinsics.d(this.imageUrl, photo360Item.imageUrl) && Intrinsics.d(this.previewImageUrl, photo360Item.previewImageUrl) && Intrinsics.d(this.description, photo360Item.description) && Intrinsics.d(this.button, photo360Item.button) && Intrinsics.d(this.buttonEvent, photo360Item.buttonEvent);
        }

        @NotNull
        public final ButtonV3Atom.SmallButton getButton() {
            return this.button;
        }

        public final t getButtonEvent() {
            return this.buttonEvent;
        }

        @NotNull
        public final String getDescription() {
            return this.description;
        }

        @NotNull
        public String getImageUrl() {
            return this.imageUrl;
        }

        public int hashCode() {
            int hashCode = this.imageUrl.hashCode() * 31;
            String str = this.previewImageUrl;
            int c11 = C2618u.c(this.button, G.g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.description), 31);
            t tVar = this.buttonEvent;
            return c11 + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.imageUrl;
            String str2 = this.previewImageUrl;
            String str3 = this.description;
            ButtonV3Atom.SmallButton smallButton = this.button;
            t tVar = this.buttonEvent;
            StringBuilder d11 = C3660k.d("Photo360Item(imageUrl=", str, ", previewImageUrl=", str2, ", description=");
            d11.append(str3);
            d11.append(", button=");
            d11.append(smallButton);
            d11.append(", buttonEvent=");
            return Tl.b.d(d11, tVar, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.imageUrl);
            dest.writeString(this.previewImageUrl);
            dest.writeString(this.description);
            dest.writeParcelable(this.button, flags);
            dest.writeParcelable(this.buttonEvent, flags);
        }

        public /* synthetic */ Photo360Item(String str, String str2, String str3, ButtonV3Atom.SmallButton smallButton, t tVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : str2, str3, smallButton, (i11 & 16) != 0 ? null : tVar);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u001a\u0010\u001c\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\u0006\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\u0007\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2VO$ImageGalleryItem;", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2VO$GalleryItem;", "", "imageUrl", "previewImageUrl", "", "isBorderless", "isParandjaEnabled", "", "imageAlpha", "LWZ/t;", "tokenizedEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZFLWZ/t;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImageUrl", "getPreviewImageUrl", "Z", "()Z", "F", "getImageAlpha", "()F", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ImageGalleryItem implements GalleryItem {

        @NotNull
        public static final Parcelable.Creator<ImageGalleryItem> CREATOR = new Creator();
        private final float imageAlpha;

        @NotNull
        private final String imageUrl;
        private final boolean isBorderless;
        private final boolean isParandjaEnabled;
        private final String previewImageUrl;
        private final t tokenizedEvent;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ImageGalleryItem> {
            @Override // android.os.Parcelable.Creator
            public final ImageGalleryItem createFromParcel(Parcel parcel) {
                boolean z11;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                boolean z12 = false;
                if (parcel.readInt() != 0) {
                    z11 = false;
                    z12 = true;
                } else {
                    z11 = false;
                }
                return new ImageGalleryItem(readString, readString2, z12, parcel.readInt() == 0 ? z11 : true, parcel.readFloat(), (t) parcel.readParcelable(ImageGalleryItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ImageGalleryItem[] newArray(int i11) {
                return new ImageGalleryItem[i11];
            }
        }

        public ImageGalleryItem(@NotNull String imageUrl, String str, boolean z11, boolean z12, float f7, t tVar) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            this.imageUrl = imageUrl;
            this.previewImageUrl = str;
            this.isBorderless = z11;
            this.isParandjaEnabled = z12;
            this.imageAlpha = f7;
            this.tokenizedEvent = tVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageGalleryItem)) {
                return false;
            }
            ImageGalleryItem imageGalleryItem = (ImageGalleryItem) other;
            return Intrinsics.d(this.imageUrl, imageGalleryItem.imageUrl) && Intrinsics.d(this.previewImageUrl, imageGalleryItem.previewImageUrl) && this.isBorderless == imageGalleryItem.isBorderless && this.isParandjaEnabled == imageGalleryItem.isParandjaEnabled && Float.compare(this.imageAlpha, imageGalleryItem.imageAlpha) == 0 && Intrinsics.d(this.tokenizedEvent, imageGalleryItem.tokenizedEvent);
        }

        public final float getImageAlpha() {
            return this.imageAlpha;
        }

        @NotNull
        public String getImageUrl() {
            return this.imageUrl;
        }

        public String getPreviewImageUrl() {
            return this.previewImageUrl;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int hashCode = this.imageUrl.hashCode() * 31;
            String str = this.previewImageUrl;
            int a11 = Pk0.b.a(this.imageAlpha, C3532b.a(C3532b.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isBorderless), 31, this.isParandjaEnabled), 31);
            t tVar = this.tokenizedEvent;
            return a11 + (tVar != null ? tVar.hashCode() : 0);
        }

        /* renamed from: isBorderless, reason: from getter */
        public final boolean getIsBorderless() {
            return this.isBorderless;
        }

        /* renamed from: isParandjaEnabled, reason: from getter */
        public final boolean getIsParandjaEnabled() {
            return this.isParandjaEnabled;
        }

        @NotNull
        public String toString() {
            String str = this.imageUrl;
            String str2 = this.previewImageUrl;
            boolean z11 = this.isBorderless;
            boolean z12 = this.isParandjaEnabled;
            float f7 = this.imageAlpha;
            t tVar = this.tokenizedEvent;
            StringBuilder d11 = C3660k.d("ImageGalleryItem(imageUrl=", str, ", previewImageUrl=", str2, ", isBorderless=");
            f.c(", isParandjaEnabled=", ", imageAlpha=", d11, z11, z12);
            d11.append(f7);
            d11.append(", tokenizedEvent=");
            d11.append(tVar);
            d11.append(")");
            return d11.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.imageUrl);
            dest.writeString(this.previewImageUrl);
            dest.writeInt(this.isBorderless ? 1 : 0);
            dest.writeInt(this.isParandjaEnabled ? 1 : 0);
            dest.writeFloat(this.imageAlpha);
            dest.writeParcelable(this.tokenizedEvent, flags);
        }

        public /* synthetic */ ImageGalleryItem(String str, String str2, boolean z11, boolean z12, float f7, t tVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : str2, z11, z12, f7, (i11 & 32) != 0 ? null : tVar);
        }
    }
}
