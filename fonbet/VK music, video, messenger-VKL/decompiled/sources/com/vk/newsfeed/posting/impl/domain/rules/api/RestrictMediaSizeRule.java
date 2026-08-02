package com.vk.newsfeed.posting.impl.domain.rules.api;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.photo.Photo;
import com.vk.newsfeed.posting.impl.domain.rules.PostingRule;
import com.vk.newsfeed.posting.impl.domain.rules.RuleAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.FileDto;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.VideoDto;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.MarketAlbumAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.fdi;
import xsna.ixj0;
import xsna.nrg0;
import xsna.xmc0;

/* compiled from: RestrictMediaSizeRule.kt */
/* loaded from: classes4.dex */
public final class RestrictMediaSizeRule implements PostingRule {
    public static final Serializer.c<RestrictMediaSizeRule> CREATOR = new b();
    public final RuleAttachment b;
    public final float c;
    public final float d;
    public final int e;

    /* compiled from: RestrictMediaSizeRule.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RuleAttachment.values().length];
            try {
                iArr[RuleAttachment.Video.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RuleAttachment.Gif.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RuleAttachment.Photo.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<RestrictMediaSizeRule> {
        @Override // com.vk.core.serialize.Serializer.c
        public final RestrictMediaSizeRule a(Serializer serializer) {
            return new RestrictMediaSizeRule((RuleAttachment) serializer.A(RuleAttachment.class.getClassLoader()), serializer.s(), serializer.s(), serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RestrictMediaSizeRule[i];
        }
    }

    public RestrictMediaSizeRule(RuleAttachment ruleAttachment, float f, float f2, int i) {
        this.b = ruleAttachment;
        this.c = f;
        this.d = f2;
        this.e = i;
    }

    @Override // com.vk.newsfeed.posting.impl.domain.rules.PostingRule
    public final PostingRule.a F2(xmc0 xmc0Var) {
        return new PostingRule.a.b(null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.P(this.c);
        serializer.P(this.d);
        serializer.S(this.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ee  */
    @Override // com.vk.newsfeed.posting.impl.domain.rules.PostingRule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<nrg0> c6(xmc0 xmc0Var) {
        Object obj;
        PostingAttachment postingAttachment;
        int i;
        Image image;
        ArrayList arrayList;
        ImageSize imageSize;
        Object obj2;
        Object obj3;
        List<PostingAttachment> list = xmc0Var.f;
        int[] iArr = a.$EnumSwitchMapping$0;
        RuleAttachment ruleAttachment = this.b;
        int i2 = iArr[ruleAttachment.ordinal()];
        if (i2 == 1) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((PostingAttachment) obj) instanceof VideoDto) {
                    break;
                }
            }
            postingAttachment = (PostingAttachment) obj;
        } else if (i2 == 2) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (((PostingAttachment) obj2) instanceof FileDto.Gif) {
                    break;
                }
            }
            postingAttachment = (PostingAttachment) obj2;
        } else if (i2 != 3) {
            postingAttachment = null;
        } else {
            Iterator<T> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it3.next();
                if (((PostingAttachment) obj3) instanceof PhotoDto) {
                    break;
                }
            }
            postingAttachment = (PostingAttachment) obj3;
        }
        if (postingAttachment != null) {
            float u = fdi.u(postingAttachment.nb());
            Attachment nb = postingAttachment.nb();
            if (nb instanceof PhotoAttachment) {
                ImageSize imageSize2 = (ImageSize) ixj0.b(((PhotoAttachment) nb).l.y.b);
                if (imageSize2 != null) {
                    i = imageSize2.d.b;
                    if (u <= this.c || this.d > u || i < this.e) {
                        return Collections.singletonList(new nrg0(ruleAttachment, 0));
                    }
                }
                i = 0;
                if (u <= this.c) {
                }
                return Collections.singletonList(new nrg0(ruleAttachment, 0));
            }
            if (nb instanceof VideoAttachment) {
                VideoAttachment videoAttachment = (VideoAttachment) nb;
                i = videoAttachment.k.getWidth() > 0 ? videoAttachment.k.getWidth() : 360;
            } else if (nb instanceof MarketAlbumAttachment) {
                Photo photo = ((MarketAlbumAttachment) nb).f.e;
                if (photo != null && (image = photo.y) != null && (arrayList = image.b) != null && (imageSize = (ImageSize) ixj0.b(arrayList)) != null) {
                    i = imageSize.d.b;
                }
                i = 0;
            } else {
                if (nb instanceof DocumentAttachment) {
                    Image image2 = ((DocumentAttachment) nb).s;
                    ImageSize imageSize3 = (ImageSize) ixj0.b(image2 != null ? image2.b : null);
                    if (imageSize3 != null) {
                        i = imageSize3.d.b;
                    }
                }
                i = 0;
            }
            if (u <= this.c) {
            }
            return Collections.singletonList(new nrg0(ruleAttachment, 0));
        }
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
}
