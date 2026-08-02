package ru.ozon.app.android.storefront.stories.setOfPreviews.data;

import Ds.C2880a;
import G.g;
import Kk.C3532b;
import Tl.b;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.stories.setContainer.data.CommonItemVO;
import ru.ozon.app.android.storefront.stories.setContainer.data.SetType;
import ru.ozon.app.android.storefront.stories.story.data.Alignment;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0013\u0010\u0014Jx\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b%\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b)\u0010\u0018R\"\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\r\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b5\u00106R\"\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u00107\u001a\u0004\b8\u00109¨\u0006:"}, d2 = {"Lru/ozon/app/android/storefront/stories/setOfPreviews/data/PreviewItemVO;", "Lru/ozon/app/android/storefront/stories/setContainer/data/CommonItemVO;", "", "storyId", "", "image", "firstFullImage", "Lru/ozon/app/android/storefront/stories/story/data/Alignment;", "firstFullImageAlign", "link", "", "hideFrame", "Lru/ozon/app/android/storefront/stories/setContainer/data/SetType;", "itemType", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/storefront/stories/story/data/Alignment;Ljava/lang/String;ZLru/ozon/app/android/storefront/stories/setContainer/data/SetType;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/storefront/stories/story/data/Alignment;Ljava/lang/String;ZLru/ozon/app/android/storefront/stories/setContainer/data/SetType;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)Lru/ozon/app/android/storefront/stories/setOfPreviews/data/PreviewItemVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getStoryId", "()Ljava/lang/Long;", "Ljava/lang/String;", "getImage", "getFirstFullImage", "Lru/ozon/app/android/storefront/stories/story/data/Alignment;", "getFirstFullImageAlign", "()Lru/ozon/app/android/storefront/stories/story/data/Alignment;", "getLink", "Z", "getHideFrame", "()Z", "setHideFrame", "(Z)V", "Lru/ozon/app/android/storefront/stories/setContainer/data/SetType;", "getItemType", "()Lru/ozon/app/android/storefront/stories/setContainer/data/SetType;", "setItemType", "(Lru/ozon/app/android/storefront/stories/setContainer/data/SetType;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PreviewItemVO implements CommonItemVO {
    private final AtomAction action;

    @NotNull
    private final String firstFullImage;

    @NotNull
    private final Alignment firstFullImageAlign;
    private boolean hideFrame;

    @NotNull
    private final String image;

    @NotNull
    private SetType itemType;
    private final String link;
    private final Long storyId;
    private final t tokenizedEvent;

    public PreviewItemVO(Long l11, @NotNull String image, @NotNull String firstFullImage, @NotNull Alignment firstFullImageAlign, String str, boolean z11, @NotNull SetType itemType, AtomAction atomAction, t tVar) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(firstFullImage, "firstFullImage");
        Intrinsics.checkNotNullParameter(firstFullImageAlign, "firstFullImageAlign");
        Intrinsics.checkNotNullParameter(itemType, "itemType");
        this.storyId = l11;
        this.image = image;
        this.firstFullImage = firstFullImage;
        this.firstFullImageAlign = firstFullImageAlign;
        this.link = str;
        this.hideFrame = z11;
        this.itemType = itemType;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
    }

    public static /* synthetic */ PreviewItemVO copy$default(PreviewItemVO previewItemVO, Long l11, String str, String str2, Alignment alignment, String str3, boolean z11, SetType setType, AtomAction atomAction, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = previewItemVO.storyId;
        }
        if ((i11 & 2) != 0) {
            str = previewItemVO.image;
        }
        if ((i11 & 4) != 0) {
            str2 = previewItemVO.firstFullImage;
        }
        if ((i11 & 8) != 0) {
            alignment = previewItemVO.firstFullImageAlign;
        }
        if ((i11 & 16) != 0) {
            str3 = previewItemVO.link;
        }
        if ((i11 & 32) != 0) {
            z11 = previewItemVO.hideFrame;
        }
        if ((i11 & 64) != 0) {
            setType = previewItemVO.itemType;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            atomAction = previewItemVO.action;
        }
        if ((i11 & 256) != 0) {
            tVar = previewItemVO.tokenizedEvent;
        }
        AtomAction atomAction2 = atomAction;
        t tVar2 = tVar;
        boolean z12 = z11;
        SetType setType2 = setType;
        String str4 = str3;
        String str5 = str2;
        return previewItemVO.copy(l11, str, str5, alignment, str4, z12, setType2, atomAction2, tVar2);
    }

    @NotNull
    public final PreviewItemVO copy(Long storyId, @NotNull String image, @NotNull String firstFullImage, @NotNull Alignment firstFullImageAlign, String link, boolean hideFrame, @NotNull SetType itemType, AtomAction action, t tokenizedEvent) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(firstFullImage, "firstFullImage");
        Intrinsics.checkNotNullParameter(firstFullImageAlign, "firstFullImageAlign");
        Intrinsics.checkNotNullParameter(itemType, "itemType");
        return new PreviewItemVO(storyId, image, firstFullImage, firstFullImageAlign, link, hideFrame, itemType, action, tokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreviewItemVO)) {
            return false;
        }
        PreviewItemVO previewItemVO = (PreviewItemVO) other;
        return Intrinsics.d(this.storyId, previewItemVO.storyId) && Intrinsics.d(this.image, previewItemVO.image) && Intrinsics.d(this.firstFullImage, previewItemVO.firstFullImage) && this.firstFullImageAlign == previewItemVO.firstFullImageAlign && Intrinsics.d(this.link, previewItemVO.link) && this.hideFrame == previewItemVO.hideFrame && this.itemType == previewItemVO.itemType && Intrinsics.d(this.action, previewItemVO.action) && Intrinsics.d(this.tokenizedEvent, previewItemVO.tokenizedEvent);
    }

    @NotNull
    public final String getFirstFullImage() {
        return this.firstFullImage;
    }

    @NotNull
    public final Alignment getFirstFullImageAlign() {
        return this.firstFullImageAlign;
    }

    public boolean getHideFrame() {
        return this.hideFrame;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @Override // ru.ozon.app.android.storefront.stories.setContainer.data.CommonItemVO
    @NotNull
    public SetType getItemType() {
        return this.itemType;
    }

    public final String getLink() {
        return this.link;
    }

    public final Long getStoryId() {
        return this.storyId;
    }

    @Override // ru.ozon.app.android.storefront.stories.setContainer.data.CommonItemVO
    public t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public int hashCode() {
        Long l11 = this.storyId;
        int hashCode = (this.firstFullImageAlign.hashCode() + g.a(g.a((l11 == null ? 0 : l11.hashCode()) * 31, 31, this.image), 31, this.firstFullImage)) * 31;
        String str = this.link;
        int hashCode2 = (this.itemType.hashCode() + C3532b.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.hideFrame)) * 31;
        AtomAction atomAction = this.action;
        int hashCode3 = (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    @Override // ru.ozon.app.android.storefront.stories.setContainer.data.CommonItemVO
    public void setHideFrame(boolean z11) {
        this.hideFrame = z11;
    }

    @NotNull
    public String toString() {
        Long l11 = this.storyId;
        String str = this.image;
        String str2 = this.firstFullImage;
        Alignment alignment = this.firstFullImageAlign;
        String str3 = this.link;
        boolean z11 = this.hideFrame;
        SetType setType = this.itemType;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("PreviewItemVO(storyId=");
        sb2.append(l11);
        sb2.append(", image=");
        sb2.append(str);
        sb2.append(", firstFullImage=");
        sb2.append(str2);
        sb2.append(", firstFullImageAlign=");
        sb2.append(alignment);
        sb2.append(", link=");
        C2880a.c(str3, ", hideFrame=", ", itemType=", sb2, z11);
        sb2.append(setType);
        sb2.append(", action=");
        sb2.append(atomAction);
        sb2.append(", tokenizedEvent=");
        return b.d(sb2, tVar, ")");
    }
}
