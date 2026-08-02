package ru.ozon.app.android.storefront.widgets.playvideo.presentation.models;

import De.C2860c;
import G.g;
import Lh.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.socialAtoms.rightPanel.RightPanelVO;
import ru.ozon.app.android.videomolecule.data.VideoMolecule;
import ru.ozon.app.android.videomolecule.presentation.rv.models.VideoMoleculeBottomContentModel;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b.\u0010-R\u001f\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/storefront/widgets/playvideo/presentation/models/PlayVideoVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/videomolecule/data/VideoMolecule;", "video", "Lru/ozon/app/android/storefront/widgets/playvideo/presentation/models/PlayVideoTopContent;", "topContent", "Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelVO;", "rightPanel", "", "Lru/ozon/app/android/videomolecule/presentation/rv/models/VideoMoleculeBottomContentModel;", "portraitBottomContent", "landScapeBottomContent", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "closeTokenizedEvent", "<init>", "(JLru/ozon/app/android/videomolecule/data/VideoMolecule;Lru/ozon/app/android/storefront/widgets/playvideo/presentation/models/PlayVideoTopContent;Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelVO;Ljava/util/List;Ljava/util/List;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/videomolecule/data/VideoMolecule;", "getVideo", "()Lru/ozon/app/android/videomolecule/data/VideoMolecule;", "Lru/ozon/app/android/storefront/widgets/playvideo/presentation/models/PlayVideoTopContent;", "getTopContent", "()Lru/ozon/app/android/storefront/widgets/playvideo/presentation/models/PlayVideoTopContent;", "Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelVO;", "getRightPanel", "()Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelVO;", "Ljava/util/List;", "getPortraitBottomContent", "()Ljava/util/List;", "getLandScapeBottomContent", "LWZ/t;", "getCloseTokenizedEvent", "()LWZ/t;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlayVideoVO implements c {
    private final t closeTokenizedEvent;
    private final long id;

    @NotNull
    private final List<VideoMoleculeBottomContentModel> landScapeBottomContent;

    @NotNull
    private final List<VideoMoleculeBottomContentModel> portraitBottomContent;

    @NotNull
    private final RightPanelVO rightPanel;

    @NotNull
    private final PlayVideoTopContent topContent;

    @NotNull
    private final VideoMolecule video;

    /* JADX WARN: Multi-variable type inference failed */
    public PlayVideoVO(long j11, @NotNull VideoMolecule video, @NotNull PlayVideoTopContent topContent, @NotNull RightPanelVO rightPanel, @NotNull List<? extends VideoMoleculeBottomContentModel> portraitBottomContent, @NotNull List<? extends VideoMoleculeBottomContentModel> landScapeBottomContent, t tVar) {
        Intrinsics.checkNotNullParameter(video, "video");
        Intrinsics.checkNotNullParameter(topContent, "topContent");
        Intrinsics.checkNotNullParameter(rightPanel, "rightPanel");
        Intrinsics.checkNotNullParameter(portraitBottomContent, "portraitBottomContent");
        Intrinsics.checkNotNullParameter(landScapeBottomContent, "landScapeBottomContent");
        this.id = j11;
        this.video = video;
        this.topContent = topContent;
        this.rightPanel = rightPanel;
        this.portraitBottomContent = portraitBottomContent;
        this.landScapeBottomContent = landScapeBottomContent;
        this.closeTokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayVideoVO)) {
            return false;
        }
        PlayVideoVO playVideoVO = (PlayVideoVO) other;
        return this.id == playVideoVO.id && Intrinsics.d(this.video, playVideoVO.video) && Intrinsics.d(this.topContent, playVideoVO.topContent) && Intrinsics.d(this.rightPanel, playVideoVO.rightPanel) && Intrinsics.d(this.portraitBottomContent, playVideoVO.portraitBottomContent) && Intrinsics.d(this.landScapeBottomContent, playVideoVO.landScapeBottomContent) && Intrinsics.d(this.closeTokenizedEvent, playVideoVO.closeTokenizedEvent);
    }

    public final t getCloseTokenizedEvent() {
        return this.closeTokenizedEvent;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<VideoMoleculeBottomContentModel> getLandScapeBottomContent() {
        return this.landScapeBottomContent;
    }

    @NotNull
    public final List<VideoMoleculeBottomContentModel> getPortraitBottomContent() {
        return this.portraitBottomContent;
    }

    @NotNull
    public final RightPanelVO getRightPanel() {
        return this.rightPanel;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final PlayVideoTopContent getTopContent() {
        return this.topContent;
    }

    @NotNull
    public final VideoMolecule getVideo() {
        return this.video;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(g.b((this.rightPanel.hashCode() + ((this.topContent.hashCode() + ((this.video.hashCode() + (Long.hashCode(this.id) * 31)) * 31)) * 31)) * 31, 31, this.portraitBottomContent), 31, this.landScapeBottomContent);
        t tVar = this.closeTokenizedEvent;
        return b11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        VideoMolecule videoMolecule = this.video;
        PlayVideoTopContent playVideoTopContent = this.topContent;
        RightPanelVO rightPanelVO = this.rightPanel;
        List<VideoMoleculeBottomContentModel> list = this.portraitBottomContent;
        List<VideoMoleculeBottomContentModel> list2 = this.landScapeBottomContent;
        t tVar = this.closeTokenizedEvent;
        StringBuilder sb2 = new StringBuilder("PlayVideoVO(id=");
        sb2.append(j11);
        sb2.append(", video=");
        sb2.append(videoMolecule);
        sb2.append(", topContent=");
        sb2.append(playVideoTopContent);
        sb2.append(", rightPanel=");
        sb2.append(rightPanelVO);
        C2860c.g(", portraitBottomContent=", ", landScapeBottomContent=", sb2, list, list2);
        return a.b(sb2, ", closeTokenizedEvent=", tVar, ")");
    }
}
