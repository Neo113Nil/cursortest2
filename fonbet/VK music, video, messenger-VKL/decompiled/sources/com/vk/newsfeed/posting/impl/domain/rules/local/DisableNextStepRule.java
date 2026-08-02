package com.vk.newsfeed.posting.impl.domain.rules.local;

import android.os.Parcel;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.serialize.Serializer;
import com.vk.newsfeed.posting.impl.domain.model.LoadingState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.d;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageIcon;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageText;
import com.vk.newsfeed.posting.impl.domain.model.settings.SettingsPriority;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vk.newsfeed.posting.impl.domain.rules.PostingRule;
import com.vk.newsfeed.posting.impl.domain.rules.RuleAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import com.vk.newsfeed.posting.impl.presentation.model.VideoDto;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import xsna.e43;
import xsna.nrg0;
import xsna.xmc0;

/* compiled from: DisableNextStepRule.kt */
/* loaded from: classes4.dex */
public final class DisableNextStepRule implements PostingRule {
    public static final Serializer.c<DisableNextStepRule> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<DisableNextStepRule> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DisableNextStepRule a(Serializer serializer) {
            return new DisableNextStepRule();
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DisableNextStepRule[i];
        }
    }

    @Override // com.vk.newsfeed.posting.impl.domain.rules.PostingRule
    public final PostingRule.a F2(xmc0 xmc0Var) {
        VKApiExecutionException vKApiExecutionException;
        Object obj;
        Throwable th;
        UploadDto.UploadState uploadState;
        PostingSettings postingSettings = xmc0Var.c;
        boolean z = xmc0Var.c(RuleAttachment.Text) || xmc0Var.c(RuleAttachment.Video) || xmc0Var.c(RuleAttachment.Photo) || xmc0Var.c(RuleAttachment.Link) || xmc0Var.c(RuleAttachment.Article);
        if (!z) {
            xmc0Var.g(new PostingUserMessage.Snackbar(new PostingUserMessageIcon(R.drawable.vk_icon_error_outline_28, R.attr.vk_ui_icon_negative), new PostingUserMessageText.ResText(R.string.next_step_error), null, 4, null));
        }
        if (postingSettings.e.i() < SettingsPriority.Network.i()) {
            xmc0Var.g(new PostingUserMessage.Service(this, postingSettings.k == LoadingState.LOADING ? new PostingAction.Fetch.SetIsWaitingExplicit(true) : d.a(new PostingAction.Fetch.SetIsWaitingExplicit(true), new PostingAction.Fetch.LoadSettingsRemoteOnly(xmc0Var.d, Integer.valueOf(xmc0Var.e))), false, 4, null));
        }
        Iterator<T> it = xmc0Var.a.i.p.iterator();
        while (true) {
            vKApiExecutionException = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            PostingAttachment postingAttachment = (PostingAttachment) obj;
            if ((postingAttachment instanceof VideoDto) && (((VideoDto) postingAttachment).f.b instanceof UploadDto.UploadStep.Failed)) {
                break;
            }
        }
        VideoDto videoDto = obj instanceof VideoDto ? (VideoDto) obj : null;
        UploadDto.UploadStep uploadStep = (videoDto == null || (uploadState = videoDto.f) == null) ? null : uploadState.b;
        UploadDto.UploadStep.Failed failed = uploadStep instanceof UploadDto.UploadStep.Failed ? (UploadDto.UploadStep.Failed) uploadStep : null;
        Throwable th2 = failed != null ? failed.b : null;
        VKApiExecutionException vKApiExecutionException2 = th2 instanceof VKApiExecutionException ? (VKApiExecutionException) th2 : null;
        if (vKApiExecutionException2 == null) {
            Object cause = (failed == null || (th = failed.b) == null) ? null : th.getCause();
            if (cause instanceof VKApiExecutionException) {
                vKApiExecutionException = (VKApiExecutionException) cause;
            }
        } else {
            vKApiExecutionException = vKApiExecutionException2;
        }
        if (vKApiExecutionException != null && vKApiExecutionException.s() == 7) {
            xmc0Var.g(new PostingUserMessage.Snackbar(new PostingUserMessageIcon(R.drawable.vk_icon_error_outline_28, R.attr.vk_ui_icon_negative), new PostingUserMessageText.ResText(R.string.uploading_error_upload_video_permission_denied), null, 4, null));
        }
        return z ? PostingRule.a.C1431a.b : new PostingRule.a.b(new PostingUserMessage.Service(this, null, false, 6, null));
    }

    @Override // com.vk.newsfeed.posting.impl.domain.rules.PostingRule
    public final List<nrg0> c6(xmc0 xmc0Var) {
        return e43.l(new nrg0(RuleAttachment.File, 0), new nrg0(RuleAttachment.Place, 0));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
    }
}
