package com.vk.vmoji.character.model;

import com.vk.api.generated.stickers.dto.StickersPackPreviewDto;
import com.vk.api.generated.stickers.dto.StickersPacksRecommendationBlockDto;
import com.vk.api.generated.vmoji.dto.VmojiGetStickerPacksRecommendationBlockResponseDto;
import com.vk.core.serialize.Serializer;
import com.vk.vmoji.character.model.VmojiStickerPackPreviewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.urd0;

/* compiled from: RecommendationsBlockModel.kt */
/* loaded from: classes7.dex */
public final class RecommendationsBlockModel extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<RecommendationsBlockModel> CREATOR = new b();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List<VmojiStickerPackPreviewModel> f;

    /* compiled from: RecommendationsBlockModel.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static RecommendationsBlockModel a(VmojiGetStickerPacksRecommendationBlockResponseDto vmojiGetStickerPacksRecommendationBlockResponseDto) {
            StickersPacksRecommendationBlockDto d = vmojiGetStickerPacksRecommendationBlockResponseDto.d();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = d.e().iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                List<StickersPackPreviewDto> e = vmojiGetStickerPacksRecommendationBlockResponseDto.e();
                StickersPackPreviewDto stickersPackPreviewDto = null;
                if (e != null) {
                    Iterator<T> it2 = e.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (((StickersPackPreviewDto) next).getId() == intValue) {
                            stickersPackPreviewDto = next;
                            break;
                        }
                    }
                    stickersPackPreviewDto = stickersPackPreviewDto;
                }
                if (stickersPackPreviewDto != null) {
                    Serializer.c<VmojiStickerPackPreviewModel> cVar = VmojiStickerPackPreviewModel.CREATOR;
                    arrayList.add(VmojiStickerPackPreviewModel.a.a(stickersPackPreviewDto));
                }
            }
            return new RecommendationsBlockModel(d.getId(), d.getTitle(), d.getType(), d.d(), arrayList);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<RecommendationsBlockModel> {
        @Override // com.vk.core.serialize.Serializer.c
        public final RecommendationsBlockModel a(Serializer serializer) {
            return new RecommendationsBlockModel(serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.B(VmojiStickerPackPreviewModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RecommendationsBlockModel[i];
        }
    }

    public RecommendationsBlockModel(String str, String str2, String str3, String str4, List<VmojiStickerPackPreviewModel> list) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.f0(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendationsBlockModel)) {
            return false;
        }
        RecommendationsBlockModel recommendationsBlockModel = (RecommendationsBlockModel) obj;
        return epx.f(this.b, recommendationsBlockModel.b) && epx.f(this.c, recommendationsBlockModel.c) && epx.f(this.d, recommendationsBlockModel.d) && epx.f(this.e, recommendationsBlockModel.e) && epx.f(this.f, recommendationsBlockModel.f);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
        String str = this.d;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return this.f.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendationsBlockModel(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", type=");
        sb.append(this.d);
        sb.append(", nextBlockId=");
        sb.append(this.e);
        sb.append(", packs=");
        return ms9.a(')', sb, this.f);
    }
}
