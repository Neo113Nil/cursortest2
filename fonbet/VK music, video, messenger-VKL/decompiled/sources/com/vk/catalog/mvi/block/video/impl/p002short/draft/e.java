package com.vk.catalog.mvi.block.video.impl.p002short.draft;

import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.camera.clips.core.drafts.ClipsDraftVkExtraData;
import com.vk.camera.clips.core.drafts.DraftUserRelatedData;
import com.vk.camera.clips.core.drafts.TemplateDraftData;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.video.impl.p002short.draft.DraftShortVideoListView;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftCommonData;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftMusicInfo;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.clips.music.ClipsEditorMusicTrack;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.OriginalSoundStatus;
import com.vk.dto.common.clips.ClipAudioTemplate;
import com.vk.dto.common.clips.ClipLinkModerationStatus;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b2a;
import xsna.b6l;
import xsna.c5g;
import xsna.e43;
import xsna.egg0;
import xsna.hxd;
import xsna.iah0;
import xsna.izs;
import xsna.jgp;
import xsna.lq9;
import xsna.s3q0;
import xsna.s7s0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;
import xsna.zcl;

/* compiled from: DraftShortVideoListView.kt */
@b6l(c = "com.vk.catalog.mvi.block.video.impl.short.draft.DraftShortVideoListView$InlineActor$loadDrafts$1", f = "DraftShortVideoListView.kt", l = {382}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class e extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ DraftShortVideoListView.State.LoadingState $state;
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ DraftShortVideoListView.b<CatalogBlockState> this$0;

    /* compiled from: DraftShortVideoListView.kt */
    public static final class a implements izs<ClipsDraftPersistentStore, s3q0> {
        public final /* synthetic */ lq9 b;
        public final /* synthetic */ DraftShortVideoListView.State.LoadingState c;

        public a(lq9 lq9Var, DraftShortVideoListView.State.LoadingState loadingState) {
            this.b = lq9Var;
            this.c = loadingState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.izs
        public final s3q0 invoke(ClipsDraftPersistentStore clipsDraftPersistentStore) {
            ClipsEditorMusicInfo clipsEditorMusicInfo;
            ClipsEditorMusicTrack clipsEditorMusicTrack;
            clipsDraftPersistentStore.getClass();
            egg0 m = ClipsDraftPersistentStore.m();
            ArrayList arrayList = new ArrayList(c5g.u(m, 10));
            Iterator it = m.iterator();
            while (true) {
                ListIterator listIterator = ((egg0.a) it).b;
                if (!listIterator.hasPrevious()) {
                    this.b.resumeWith(arrayList);
                    return s3q0.a;
                }
                ClipsDraftVk clipsDraftVk = (ClipsDraftVk) listIterator.previous();
                DraftShortVideoListView.State.LoadingState loadingState = this.c;
                UserId userId = loadingState.d;
                if (userId == null) {
                    userId = UserId.d;
                }
                ClipsDraftVkExtraData clipsDraftVkExtraData = clipsDraftVk.c;
                ClipsDraftVkExtraData clipsDraftVkExtraData2 = clipsDraftVk.c;
                ClipsDraftCommonData clipsDraftCommonData = clipsDraftVk.b;
                ClipsDraftMusicInfo clipsDraftMusicInfo = clipsDraftVkExtraData.c;
                MusicTrack c = (clipsDraftMusicInfo == null || (clipsEditorMusicInfo = clipsDraftMusicInfo.b) == null || (clipsEditorMusicTrack = clipsEditorMusicInfo.b) == null) ? null : hxd.c(clipsEditorMusicTrack);
                List list = EmptyList.b;
                OriginalSoundStatus originalSoundStatus = OriginalSoundStatus.NONE;
                ClipLinkModerationStatus clipLinkModerationStatus = ClipLinkModerationStatus.UNDEFINED;
                TemplateDraftData templateDraftData = clipsDraftVkExtraData2.i;
                ClipAudioTemplate clipAudioTemplate = templateDraftData != null ? templateDraftData.b : null;
                DraftUserRelatedData draftUserRelatedData = clipsDraftVkExtraData2.j;
                List m2 = e43.m(draftUserRelatedData != null ? draftUserRelatedData.d : null);
                DraftUserRelatedData draftUserRelatedData2 = clipsDraftVkExtraData2.j;
                List list2 = draftUserRelatedData2 != null ? draftUserRelatedData2.c : null;
                ClipVideoFile clipVideoFile = new ClipVideoFile(null, c, list, list, null, null, originalSoundStatus, false, clipLinkModerationStatus, clipAudioTemplate, m2, list2 == null ? list : list2, jgp.b, null, null, list, null, null, null);
                clipVideoFile.p = "short_video";
                clipVideoFile.b = userId;
                clipVideoFile.P0 = clipsDraftCommonData.b;
                clipVideoFile.B = true;
                clipVideoFile.v = 0;
                clipVideoFile.C = true;
                clipVideoFile.u = 0;
                clipVideoFile.H = true;
                clipVideoFile.w = 0;
                clipVideoFile.T = true;
                clipVideoFile.t0 = false;
                clipVideoFile.D = true;
                clipVideoFile.X1 = false;
                clipVideoFile.q1 = true;
                Image image = new Image((List<ImageSize>) Collections.singletonList(new ImageSize(clipsDraftCommonData.j, -1, (char) 0, false, 12, (zcl) null)));
                clipVideoFile.I0 = image;
                ImageSize Cb = image.Cb(iah0.f().widthPixels, true, false);
                arrayList.add(new DraftShortVideoListView.State.ClipState(new BlockId.CompositeId(loadingState.b, clipsDraftCommonData.b), loadingState.c, Cb != null ? Cb.d.d : null, clipVideoFile));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(DraftShortVideoListView.b<CatalogBlockState> bVar, DraftShortVideoListView.State.LoadingState loadingState, spj<? super e> spjVar) {
        super(2, spjVar);
        this.this$0 = bVar;
        this.$state = loadingState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new e(this.this$0, this.$state, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((e) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            DraftShortVideoListView.State.LoadingState loadingState = this.$state;
            this.L$0 = loadingState;
            this.I$0 = 0;
            this.label = 1;
            lq9 lq9Var = new lq9(1, s7s0.c(this));
            lq9Var.o();
            ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
            a aVar = new a(lq9Var, loadingState);
            clipsDraftPersistentStore.getClass();
            ClipsDraftPersistentStore.o(aVar);
            obj = lq9Var.n();
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        DraftShortVideoListView.b<CatalogBlockState> bVar = this.this$0;
        DraftShortVideoListView.State.LoadingState loadingState2 = this.$state;
        BlockId.Simple simple = new BlockId.Simple(loadingState2.b);
        List list = (List) obj;
        if (list.isEmpty()) {
            list = Collections.singletonList(new DraftShortVideoListView.State.PlaceholderState(loadingState2.b, loadingState2.c, null));
        }
        ((b2a) bVar.b.b).i(simple, list);
        return s3q0.a;
    }
}
