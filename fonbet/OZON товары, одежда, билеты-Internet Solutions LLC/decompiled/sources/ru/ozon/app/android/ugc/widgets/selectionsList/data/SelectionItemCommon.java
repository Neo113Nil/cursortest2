package ru.ozon.app.android.ugc.widgets.selectionsList.data;

import Pk0.h;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV4;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003Ju\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006-"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionItemCommon;", "", "background", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/BackgroundDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "topRightContent", "topGradient", "", "", "bottomGradient", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/app/android/ugc/widgets/selectionsList/data/BackgroundDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Object;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getBackground", "()Lru/ozon/app/android/ugc/widgets/selectionsList/data/BackgroundDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTopRightContent", "()Ljava/lang/Object;", "getTopGradient", "()Ljava/util/List;", "getBottomGradient", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SelectionItemCommon {
    public static final int $stable = 8;
    private final AtomActionDTO action;
    private final BackgroundDTO background;
    private final List<String> bottomGradient;
    private final TestInfo testInfo;
    private final List<String> topGradient;
    private final Object topRightContent;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public SelectionItemCommon(BackgroundDTO backgroundDTO, AtomActionDTO atomActionDTO, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "favoriteMolecule", name = "CONTENT_TYPE_FAVORITE_MOLECULE", type = FavoriteProductMoleculeV4.class), @ProtoOneOfSignature(fieldName = "playIcon", name = "CONTENT_TYPE_PLAY_ICON", type = IconDTO.class)}) @ProtoOneOf(label = "type") Object obj, List<String> list, List<String> list2, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        this.background = backgroundDTO;
        this.action = atomActionDTO;
        this.topRightContent = obj;
        this.topGradient = list;
        this.bottomGradient = list2;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }

    public static /* synthetic */ SelectionItemCommon copy$default(SelectionItemCommon selectionItemCommon, BackgroundDTO backgroundDTO, AtomActionDTO atomActionDTO, Object obj, List list, List list2, Map map, TestInfo testInfo, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            backgroundDTO = selectionItemCommon.background;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = selectionItemCommon.action;
        }
        if ((i11 & 4) != 0) {
            obj = selectionItemCommon.topRightContent;
        }
        if ((i11 & 8) != 0) {
            list = selectionItemCommon.topGradient;
        }
        if ((i11 & 16) != 0) {
            list2 = selectionItemCommon.bottomGradient;
        }
        if ((i11 & 32) != 0) {
            map = selectionItemCommon.trackingInfo;
        }
        if ((i11 & 64) != 0) {
            testInfo = selectionItemCommon.testInfo;
        }
        Map map2 = map;
        TestInfo testInfo2 = testInfo;
        List list3 = list2;
        Object obj3 = obj;
        return selectionItemCommon.copy(backgroundDTO, atomActionDTO, obj3, list, list3, map2, testInfo2);
    }

    /* renamed from: component1, reason: from getter */
    public final BackgroundDTO getBackground() {
        return this.background;
    }

    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final Object getTopRightContent() {
        return this.topRightContent;
    }

    public final List<String> component4() {
        return this.topGradient;
    }

    public final List<String> component5() {
        return this.bottomGradient;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final SelectionItemCommon copy(BackgroundDTO background, AtomActionDTO action, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "favoriteMolecule", name = "CONTENT_TYPE_FAVORITE_MOLECULE", type = FavoriteProductMoleculeV4.class), @ProtoOneOfSignature(fieldName = "playIcon", name = "CONTENT_TYPE_PLAY_ICON", type = IconDTO.class)}) @ProtoOneOf(label = "type") Object topRightContent, List<String> topGradient, List<String> bottomGradient, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
        return new SelectionItemCommon(background, action, topRightContent, topGradient, bottomGradient, trackingInfo, testInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionItemCommon)) {
            return false;
        }
        SelectionItemCommon selectionItemCommon = (SelectionItemCommon) other;
        return Intrinsics.d(this.background, selectionItemCommon.background) && Intrinsics.d(this.action, selectionItemCommon.action) && Intrinsics.d(this.topRightContent, selectionItemCommon.topRightContent) && Intrinsics.d(this.topGradient, selectionItemCommon.topGradient) && Intrinsics.d(this.bottomGradient, selectionItemCommon.bottomGradient) && Intrinsics.d(this.trackingInfo, selectionItemCommon.trackingInfo) && Intrinsics.d(this.testInfo, selectionItemCommon.testInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final BackgroundDTO getBackground() {
        return this.background;
    }

    public final List<String> getBottomGradient() {
        return this.bottomGradient;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final List<String> getTopGradient() {
        return this.topGradient;
    }

    public final Object getTopRightContent() {
        return this.topRightContent;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        BackgroundDTO backgroundDTO = this.background;
        int hashCode = (backgroundDTO == null ? 0 : backgroundDTO.hashCode()) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Object obj = this.topRightContent;
        int hashCode3 = (hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        List<String> list = this.topGradient;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.bottomGradient;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode6 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        BackgroundDTO backgroundDTO = this.background;
        AtomActionDTO atomActionDTO = this.action;
        Object obj = this.topRightContent;
        List<String> list = this.topGradient;
        List<String> list2 = this.bottomGradient;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        StringBuilder sb2 = new StringBuilder("SelectionItemCommon(background=");
        sb2.append(backgroundDTO);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        sb2.append(", topRightContent=");
        sb2.append(obj);
        sb2.append(", topGradient=");
        sb2.append(list);
        sb2.append(", bottomGradient=");
        sb2.append(list2);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", testInfo=");
        return h.c(sb2, testInfo, ")");
    }
}
