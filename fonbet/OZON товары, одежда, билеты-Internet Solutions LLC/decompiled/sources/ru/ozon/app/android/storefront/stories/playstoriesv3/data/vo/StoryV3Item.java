package ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo;

import C.J;
import De.C2859b;
import Pk0.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.container.SocialProductListDTO;
import ru.ozon.app.android.storefront.stories.story.data.StorySoundControlDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0081\b\u0018\u00002\u00020\u0001Bg\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b#\u0010 J\u001a\u0010&\u001a\u00020\u00142\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u00103R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010@\u001a\u0004\bA\u0010B¨\u0006C"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Item;", "Landroid/os/Parcelable;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3ItemAsset;", "asset", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Content;", "content", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "button", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO;", "productsList", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3TabBar;", "tabBar", "Lru/ozon/app/android/storefront/stories/story/data/StorySoundControlDTO;", "soundControl", "", "shouldShowBottomShadow", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3ItemAsset;Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Content;Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO;Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3TabBar;Lru/ozon/app/android/storefront/stories/story/data/StorySoundControlDTO;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3ItemAsset;", "getAsset", "()Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3ItemAsset;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Content;", "getContent", "()Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Content;", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO;", "getProductsList", "()Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3TabBar;", "getTabBar", "()Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3TabBar;", "Lru/ozon/app/android/storefront/stories/story/data/StorySoundControlDTO;", "getSoundControl", "()Lru/ozon/app/android/storefront/stories/story/data/StorySoundControlDTO;", "Z", "getShouldShowBottomShadow", "()Z", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StoryV3Item implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoryV3Item> CREATOR = new Creator();
    private final AtomActionDTO action;

    @NotNull
    private final StoryV3ItemAsset asset;
    private final ButtonDTO button;
    private final StoryV3Content content;
    private final SocialProductListDTO productsList;
    private final boolean shouldShowBottomShadow;
    private final StorySoundControlDTO soundControl;

    @NotNull
    private final StoryV3TabBar tabBar;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StoryV3Item> {
        @Override // android.os.Parcelable.Creator
        public final StoryV3Item createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            AtomActionDTO atomActionDTO = (AtomActionDTO) parcel.readParcelable(StoryV3Item.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(StoryV3Item.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new StoryV3Item(atomActionDTO, linkedHashMap, (StoryV3ItemAsset) parcel.readValue(StoryV3Item.class.getClassLoader()), parcel.readInt() == 0 ? null : StoryV3Content.CREATOR.createFromParcel(parcel), (ButtonDTO) parcel.readParcelable(StoryV3Item.class.getClassLoader()), (SocialProductListDTO) parcel.readParcelable(StoryV3Item.class.getClassLoader()), StoryV3TabBar.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StorySoundControlDTO.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final StoryV3Item[] newArray(int i11) {
            return new StoryV3Item[i11];
        }
    }

    public StoryV3Item(AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, @NotNull StoryV3ItemAsset asset, StoryV3Content storyV3Content, ButtonDTO buttonDTO, SocialProductListDTO socialProductListDTO, @NotNull StoryV3TabBar tabBar, StorySoundControlDTO storySoundControlDTO, boolean z11) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(tabBar, "tabBar");
        this.action = atomActionDTO;
        this.trackingInfo = map;
        this.asset = asset;
        this.content = storyV3Content;
        this.button = buttonDTO;
        this.productsList = socialProductListDTO;
        this.tabBar = tabBar;
        this.soundControl = storySoundControlDTO;
        this.shouldShowBottomShadow = z11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoryV3Item)) {
            return false;
        }
        StoryV3Item storyV3Item = (StoryV3Item) other;
        return Intrinsics.d(this.action, storyV3Item.action) && Intrinsics.d(this.trackingInfo, storyV3Item.trackingInfo) && Intrinsics.d(this.asset, storyV3Item.asset) && Intrinsics.d(this.content, storyV3Item.content) && Intrinsics.d(this.button, storyV3Item.button) && Intrinsics.d(this.productsList, storyV3Item.productsList) && Intrinsics.d(this.tabBar, storyV3Item.tabBar) && Intrinsics.d(this.soundControl, storyV3Item.soundControl) && this.shouldShowBottomShadow == storyV3Item.shouldShowBottomShadow;
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final StoryV3ItemAsset getAsset() {
        return this.asset;
    }

    public final ButtonDTO getButton() {
        return this.button;
    }

    public final StoryV3Content getContent() {
        return this.content;
    }

    public final SocialProductListDTO getProductsList() {
        return this.productsList;
    }

    public final boolean getShouldShowBottomShadow() {
        return this.shouldShowBottomShadow;
    }

    public final StorySoundControlDTO getSoundControl() {
        return this.soundControl;
    }

    @NotNull
    public final StoryV3TabBar getTabBar() {
        return this.tabBar;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        AtomActionDTO atomActionDTO = this.action;
        int hashCode = (atomActionDTO == null ? 0 : atomActionDTO.hashCode()) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (this.asset.hashCode() + ((hashCode + (map == null ? 0 : map.hashCode())) * 31)) * 31;
        StoryV3Content storyV3Content = this.content;
        int hashCode3 = (hashCode2 + (storyV3Content == null ? 0 : storyV3Content.hashCode())) * 31;
        ButtonDTO buttonDTO = this.button;
        int hashCode4 = (hashCode3 + (buttonDTO == null ? 0 : buttonDTO.hashCode())) * 31;
        SocialProductListDTO socialProductListDTO = this.productsList;
        int hashCode5 = (this.tabBar.hashCode() + ((hashCode4 + (socialProductListDTO == null ? 0 : socialProductListDTO.hashCode())) * 31)) * 31;
        StorySoundControlDTO storySoundControlDTO = this.soundControl;
        return Boolean.hashCode(this.shouldShowBottomShadow) + ((hashCode5 + (storySoundControlDTO != null ? storySoundControlDTO.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StoryV3ItemAsset storyV3ItemAsset = this.asset;
        StoryV3Content storyV3Content = this.content;
        ButtonDTO buttonDTO = this.button;
        SocialProductListDTO socialProductListDTO = this.productsList;
        StoryV3TabBar storyV3TabBar = this.tabBar;
        StorySoundControlDTO storySoundControlDTO = this.soundControl;
        boolean z11 = this.shouldShowBottomShadow;
        StringBuilder sb2 = new StringBuilder("StoryV3Item(action=");
        sb2.append(atomActionDTO);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", asset=");
        sb2.append(storyV3ItemAsset);
        sb2.append(", content=");
        sb2.append(storyV3Content);
        sb2.append(", button=");
        sb2.append(buttonDTO);
        sb2.append(", productsList=");
        sb2.append(socialProductListDTO);
        sb2.append(", tabBar=");
        sb2.append(storyV3TabBar);
        sb2.append(", soundControl=");
        sb2.append(storySoundControlDTO);
        sb2.append(", shouldShowBottomShadow=");
        return a.a(")", sb2, z11);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.action, flags);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }
        dest.writeValue(this.asset);
        StoryV3Content storyV3Content = this.content;
        if (storyV3Content == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            storyV3Content.writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.button, flags);
        dest.writeParcelable(this.productsList, flags);
        this.tabBar.writeToParcel(dest, flags);
        StorySoundControlDTO storySoundControlDTO = this.soundControl;
        if (storySoundControlDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            storySoundControlDTO.writeToParcel(dest, flags);
        }
        dest.writeInt(this.shouldShowBottomShadow ? 1 : 0);
    }
}
