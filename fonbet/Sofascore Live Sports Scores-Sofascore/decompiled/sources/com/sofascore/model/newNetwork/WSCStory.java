package com.sofascore.model.newNetwork;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.dmi;
import defpackage.gz1;
import defpackage.joa;
import defpackage.me4;
import defpackage.mz1;
import defpackage.oea;
import defpackage.ogj;
import defpackage.pxk;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 K2\u00020\u0001:\u0002LKBi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012B\u008d\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0011\u0010\u0018J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010 J\u0012\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010 J\u0086\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010 J\u0010\u0010.\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u00020\b2\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b4\u0010 J\u0018\u00105\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÂ\u0003¢\u0006\u0004\b5\u00106J'\u0010?\u001a\u00020<2\u0006\u00107\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\b=\u0010>R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010@\u001a\u0004\b\u001d\u0010 R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010@\u001a\u0004\bA\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\bB\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010C\u001a\u0004\bD\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010E\u001a\u0004\bF\u0010&R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010@R\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010GR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bH\u0010 R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010I\u001a\u0004\b\u000f\u0010)R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\bJ\u0010 R\u001a\u0010\u0015\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010@\u001a\u0004\b\u001b\u0010 ¨\u0006M"}, d2 = {"Lcom/sofascore/model/newNetwork/WSCStory;", "Lcom/sofascore/model/newNetwork/IHighlightMediaItem;", "", "id", "title", "sdkId", "Lcom/sofascore/model/newNetwork/WSCGameData;", "game", "", "live", "storyThumbnailUrl", "", "Lcom/sofascore/model/newNetwork/WSCStoryThumbnail;", "storyThumbnailUrls", "storyUrl", "isImageBasedStory", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/newNetwork/WSCGameData;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "", "seen0", "thumbnailUrl", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/newNetwork/WSCGameData;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lt5h;)V", "Lcom/sofascore/model/newNetwork/WSCThumbnailAspectRatio;", "aspectRatio", "getThumbnailUrl", "(Lcom/sofascore/model/newNetwork/WSCThumbnailAspectRatio;)Ljava/lang/String;", "getId", "()Ljava/lang/Integer;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/sofascore/model/newNetwork/WSCGameData;", "component5", "()Z", "component8", "component9", "()Ljava/lang/Boolean;", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/newNetwork/WSCGameData;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/sofascore/model/newNetwork/WSCStory;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "component6", "component7", "()Ljava/util/List;", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/WSCStory;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getSdkId", "Lcom/sofascore/model/newNetwork/WSCGameData;", "getGame", "Z", "getLive", "Ljava/util/List;", "getStoryUrl", "Ljava/lang/Boolean;", "getType", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WSCStory implements IHighlightMediaItem {

    @Nullable
    private final WSCGameData game;

    @NotNull
    private final String id;

    @Nullable
    private final Boolean isImageBasedStory;
    private final boolean live;

    @NotNull
    private final String sdkId;

    @Nullable
    private final String storyThumbnailUrl;

    @Nullable
    private final List<WSCStoryThumbnail> storyThumbnailUrls;

    @Nullable
    private final String storyUrl;

    @NotNull
    private final String thumbnailUrl;

    @NotNull
    private final String title;

    @Nullable
    private final String type;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, null, null, null, ypa.a(ysa.b, new pxk(29)), null, null, null, null};

    public /* synthetic */ WSCStory(int i, String str, String str2, String str3, WSCGameData wSCGameData, boolean z, String str4, List list, String str5, Boolean bool, String str6, String str7, t5h t5hVar) {
        if (1023 != (i & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE)) {
            oea.z(i, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, WSCStory$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.title = str2;
        this.sdkId = str3;
        this.game = wSCGameData;
        this.live = z;
        this.storyThumbnailUrl = str4;
        this.storyThumbnailUrls = list;
        this.storyUrl = str5;
        this.isImageBasedStory = bool;
        this.type = str6;
        if ((i & 1024) != 0) {
            this.thumbnailUrl = str7;
        } else {
            String thumbnailUrl = getThumbnailUrl(WSCThumbnailAspectRatio.RATIO_16X9);
            this.thumbnailUrl = thumbnailUrl == null ? "" : thumbnailUrl;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(WSCStoryThumbnail$$serializer.INSTANCE, 0);
    }

    /* renamed from: component6, reason: from getter */
    private final String getStoryThumbnailUrl() {
        return this.storyThumbnailUrl;
    }

    private final List<WSCStoryThumbnail> component7() {
        return this.storyThumbnailUrls;
    }

    public static /* synthetic */ WSCStory copy$default(WSCStory wSCStory, String str, String str2, String str3, WSCGameData wSCGameData, boolean z, String str4, List list, String str5, Boolean bool, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wSCStory.id;
        }
        if ((i & 2) != 0) {
            str2 = wSCStory.title;
        }
        if ((i & 4) != 0) {
            str3 = wSCStory.sdkId;
        }
        if ((i & 8) != 0) {
            wSCGameData = wSCStory.game;
        }
        if ((i & 16) != 0) {
            z = wSCStory.live;
        }
        if ((i & 32) != 0) {
            str4 = wSCStory.storyThumbnailUrl;
        }
        if ((i & 64) != 0) {
            list = wSCStory.storyThumbnailUrls;
        }
        if ((i & 128) != 0) {
            str5 = wSCStory.storyUrl;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            bool = wSCStory.isImageBasedStory;
        }
        if ((i & 512) != 0) {
            str6 = wSCStory.type;
        }
        Boolean bool2 = bool;
        String str7 = str6;
        List list2 = list;
        String str8 = str5;
        boolean z2 = z;
        String str9 = str4;
        return wSCStory.copy(str, str2, str3, wSCGameData, z2, str9, list2, str8, bool2, str7);
    }

    public static /* synthetic */ String getThumbnailUrl$default(WSCStory wSCStory, WSCThumbnailAspectRatio wSCThumbnailAspectRatio, int i, Object obj) {
        if ((i & 1) != 0) {
            wSCThumbnailAspectRatio = WSCThumbnailAspectRatio.RATIO_DEFAULT;
        }
        return wSCStory.getThumbnailUrl(wSCThumbnailAspectRatio);
    }

    public static final /* synthetic */ void write$Self$model_release(WSCStory self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.y(serialDesc, 0, self.id);
        output.y(serialDesc, 1, self.getTitle());
        output.y(serialDesc, 2, self.sdkId);
        output.h(serialDesc, 3, WSCGameData$$serializer.INSTANCE, self.game);
        output.x(serialDesc, 4, self.live);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 5, uhiVar, self.storyThumbnailUrl);
        output.h(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.storyThumbnailUrls);
        output.h(serialDesc, 7, uhiVar, self.storyUrl);
        output.h(serialDesc, 8, gz1.a, self.isImageBasedStory);
        output.h(serialDesc, 9, uhiVar, self.type);
        if (!output.o(serialDesc)) {
            String thumbnailUrl = self.getThumbnailUrl();
            String thumbnailUrl2 = self.getThumbnailUrl(WSCThumbnailAspectRatio.RATIO_16X9);
            if (thumbnailUrl2 == null) {
                thumbnailUrl2 = "";
            }
            if (Intrinsics.c(thumbnailUrl, thumbnailUrl2)) {
                return;
            }
        }
        output.y(serialDesc, 10, self.getThumbnailUrl());
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSdkId() {
        return this.sdkId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final WSCGameData getGame() {
        return this.game;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getLive() {
        return this.live;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getStoryUrl() {
        return this.storyUrl;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Boolean getIsImageBasedStory() {
        return this.isImageBasedStory;
    }

    @NotNull
    public final WSCStory copy(@NotNull String id, @NotNull String title, @NotNull String sdkId, @Nullable WSCGameData game, boolean live, @Nullable String storyThumbnailUrl, @Nullable List<WSCStoryThumbnail> storyThumbnailUrls, @Nullable String storyUrl, @Nullable Boolean isImageBasedStory, @Nullable String type) {
        id.getClass();
        title.getClass();
        sdkId.getClass();
        return new WSCStory(id, title, sdkId, game, live, storyThumbnailUrl, storyThumbnailUrls, storyUrl, isImageBasedStory, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WSCStory)) {
            return false;
        }
        WSCStory wSCStory = (WSCStory) other;
        return Intrinsics.c(this.id, wSCStory.id) && Intrinsics.c(this.title, wSCStory.title) && Intrinsics.c(this.sdkId, wSCStory.sdkId) && Intrinsics.c(this.game, wSCStory.game) && this.live == wSCStory.live && Intrinsics.c(this.storyThumbnailUrl, wSCStory.storyThumbnailUrl) && Intrinsics.c(this.storyThumbnailUrls, wSCStory.storyThumbnailUrls) && Intrinsics.c(this.storyUrl, wSCStory.storyUrl) && Intrinsics.c(this.isImageBasedStory, wSCStory.isImageBasedStory) && Intrinsics.c(this.type, wSCStory.type);
    }

    @Nullable
    public final WSCGameData getGame() {
        return this.game;
    }

    @Override // com.sofascore.model.newNetwork.IHighlightMediaItem
    @Nullable
    /* renamed from: getId */
    public Integer mo689getId() {
        return StringsKt.toIntOrNull(this.id);
    }

    public final boolean getLive() {
        return this.live;
    }

    @NotNull
    public final String getSdkId() {
        return this.sdkId;
    }

    @Nullable
    public final String getStoryUrl() {
        return this.storyUrl;
    }

    @Override // com.sofascore.model.newNetwork.IHighlightMediaItem
    @Nullable
    public /* bridge */ String getSubtitle() {
        return super.getSubtitle();
    }

    @Nullable
    public final String getThumbnailUrl(@NotNull WSCThumbnailAspectRatio aspectRatio) {
        String url;
        aspectRatio.getClass();
        List<WSCStoryThumbnail> list = this.storyThumbnailUrls;
        if (list != null) {
            for (WSCStoryThumbnail wSCStoryThumbnail : list) {
                if (Intrinsics.c(wSCStoryThumbnail.getAspectRatio(), aspectRatio.getRatio())) {
                    if (wSCStoryThumbnail != null && (url = wSCStoryThumbnail.getUrl()) != null) {
                        return url;
                    }
                }
            }
            ogj.m("Collection contains no element matching the predicate.");
            return null;
        }
        return this.storyThumbnailUrl;
    }

    @Override // com.sofascore.model.newNetwork.IHighlightMediaItem
    @NotNull
    public String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Override // com.sofascore.model.newNetwork.IHighlightMediaItem
    @Nullable
    public /* bridge */ String getVideoUrl() {
        return super.getVideoUrl();
    }

    public int hashCode() {
        int c = dmi.c(dmi.c(this.id.hashCode() * 31, 31, this.title), 31, this.sdkId);
        WSCGameData wSCGameData = this.game;
        int e = dmi.e((c + (wSCGameData == null ? 0 : wSCGameData.hashCode())) * 31, 31, this.live);
        String str = this.storyThumbnailUrl;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        List<WSCStoryThumbnail> list = this.storyThumbnailUrls;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.storyUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isImageBasedStory;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.type;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @Nullable
    public final Boolean isImageBasedStory() {
        return this.isImageBasedStory;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.sdkId;
        WSCGameData wSCGameData = this.game;
        boolean z = this.live;
        String str4 = this.storyThumbnailUrl;
        List<WSCStoryThumbnail> list = this.storyThumbnailUrls;
        String str5 = this.storyUrl;
        Boolean bool = this.isImageBasedStory;
        String str6 = this.type;
        StringBuilder s = mz1.s("WSCStory(id=", str, ", title=", str2, ", sdkId=");
        s.append(str3);
        s.append(", game=");
        s.append(wSCGameData);
        s.append(", live=");
        s.append(z);
        s.append(", storyThumbnailUrl=");
        s.append(str4);
        s.append(", storyThumbnailUrls=");
        s.append(list);
        s.append(", storyUrl=");
        s.append(str5);
        s.append(", isImageBasedStory=");
        s.append(bool);
        s.append(", type=");
        s.append(str6);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/WSCStory$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/WSCStory;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return WSCStory$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Override // com.sofascore.model.newNetwork.IHighlightMediaItem
    @NotNull
    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public WSCStory(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable WSCGameData wSCGameData, boolean z, @Nullable String str4, @Nullable List<WSCStoryThumbnail> list, @Nullable String str5, @Nullable Boolean bool, @Nullable String str6) {
        me4.p(str, str2, str3);
        this.id = str;
        this.title = str2;
        this.sdkId = str3;
        this.game = wSCGameData;
        this.live = z;
        this.storyThumbnailUrl = str4;
        this.storyThumbnailUrls = list;
        this.storyUrl = str5;
        this.isImageBasedStory = bool;
        this.type = str6;
        String thumbnailUrl = getThumbnailUrl(WSCThumbnailAspectRatio.RATIO_16X9);
        this.thumbnailUrl = thumbnailUrl == null ? "" : thumbnailUrl;
    }
}
