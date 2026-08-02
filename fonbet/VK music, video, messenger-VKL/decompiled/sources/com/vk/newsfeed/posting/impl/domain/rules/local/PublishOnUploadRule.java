package com.vk.newsfeed.posting.impl.domain.rules.local;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.PublicationState;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageIcon;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageText;
import com.vk.newsfeed.posting.impl.domain.model.music.MusicAttachDto;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vk.newsfeed.posting.impl.domain.rules.PostingRule;
import com.vk.newsfeed.posting.impl.domain.rules.RuleAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.FileDto;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.VideoDto;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.nrg0;
import xsna.xmc0;
import xsna.zrp;

/* compiled from: PublishOnUploadRule.kt */
/* loaded from: classes4.dex */
public final class PublishOnUploadRule implements PostingRule {
    public static final Serializer.c<PublishOnUploadRule> CREATOR = new b();

    /* compiled from: PublishOnUploadRule.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PublicationState.values().length];
            try {
                iArr[PublicationState.InProgress.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<PublishOnUploadRule> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PublishOnUploadRule a(Serializer serializer) {
            return new PublishOnUploadRule();
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PublishOnUploadRule[i];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0084, code lost:
    
        if (xsna.xmc0.e(r6) == false) goto L36;
     */
    @Override // com.vk.newsfeed.posting.impl.domain.rules.PostingRule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PostingRule.a F2(xmc0 xmc0Var) {
        boolean z;
        MusicAttachDto musicAttachDto;
        PostingState.Editing editing = xmc0Var.a;
        boolean z2 = editing.p;
        PostEditableData postEditableData = editing.i;
        if (z2) {
            zrp<RuleAttachment> i = RuleAttachment.i();
            boolean z3 = false;
            if (i == null || !i.isEmpty()) {
                Iterator<E> it = i.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    int i2 = xmc0.a.$EnumSwitchMapping$0[((RuleAttachment) it.next()).ordinal()];
                    if (i2 == 1) {
                        List<PostingAttachment> list = postEditableData.p;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            for (PostingAttachment postingAttachment : list) {
                                if ((postingAttachment instanceof VideoDto) && !xmc0.e(((VideoDto) postingAttachment).f)) {
                                    z = true;
                                    break;
                                    break;
                                }
                            }
                        }
                        z = false;
                    } else if (i2 != 3) {
                        if (i2 == 10) {
                            FileDto fileDto = postEditableData.m;
                            if (fileDto != null) {
                                UploadDto.UploadState I4 = fileDto.I4();
                                if (I4 != null) {
                                }
                            }
                        } else if (i2 == 6) {
                            MusicAttachDto musicAttachDto2 = postEditableData.l;
                            if (musicAttachDto2 != null) {
                                z = xmc0.d(musicAttachDto2);
                            }
                        } else if (i2 == 7 && (musicAttachDto = postEditableData.l) != null) {
                            z = xmc0.d(musicAttachDto);
                        }
                        z = false;
                    } else {
                        List<PostingAttachment> list2 = postEditableData.p;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            for (PostingAttachment postingAttachment2 : list2) {
                                if ((postingAttachment2 instanceof PhotoDto) && !xmc0.e(((PhotoDto) postingAttachment2).f)) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        z = false;
                    }
                    if (z) {
                        z3 = true;
                        break;
                    }
                }
            }
            if (z3) {
                xmc0Var.h(new PostingUserMessage.Snackbar(new PostingUserMessageIcon(R.drawable.vk_icon_error_outline_28, R.attr.vk_ui_icon_negative), new PostingUserMessageText.ResText(R.string.publish_while_uploading_error), null, 4, null));
            }
        } else {
            xmc0Var.h(new PostingUserMessage.Snackbar(new PostingUserMessageIcon(R.drawable.vk_icon_error_outline_28, R.attr.vk_ui_icon_negative), new PostingUserMessageText.ResText(R.string.posting_common_network_error), null, 4, null));
        }
        if (a.$EnumSwitchMapping$0[xmc0Var.b.ordinal()] == 1) {
            xmc0Var.h(null);
        }
        return PostingRule.a.C1431a.b;
    }

    @Override // com.vk.newsfeed.posting.impl.domain.rules.PostingRule
    public final List<nrg0> c6(xmc0 xmc0Var) {
        return null;
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
