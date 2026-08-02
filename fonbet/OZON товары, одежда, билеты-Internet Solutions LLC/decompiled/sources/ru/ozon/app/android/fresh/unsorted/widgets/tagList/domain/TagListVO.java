package ru.ozon.app.android.fresh.unsorted.widgets.tagList.domain;

import Am.C2438a;
import B0.C2454a;
import Ek.a;
import G.g;
import K00.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001(B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/tagList/domain/TagListVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "tags", "", "backgroundColor", "Lru/ozon/app/android/fresh/unsorted/widgets/tagList/domain/TagListVO$SpacersVO;", "spacers", "LWZ/t;", "tokenizedEvent", "<init>", "(JLjava/util/List;Ljava/lang/String;Lru/ozon/app/android/fresh/unsorted/widgets/tagList/domain/TagListVO$SpacersVO;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/app/android/fresh/unsorted/widgets/tagList/domain/TagListVO$SpacersVO;", "getSpacers", "()Lru/ozon/app/android/fresh/unsorted/widgets/tagList/domain/TagListVO$SpacersVO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "SpacersVO", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TagListVO implements c {
    private final String backgroundColor;
    private final long id;

    @NotNull
    private final SpacersVO spacers;

    @NotNull
    private final List<TagButtonDTO> tags;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0018\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/tagList/domain/TagListVO$SpacersVO;", "", "", "left", "right", "top", "bottom", "between", "<init>", "(IIIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getLeft", "getRight", "getTop", "getBottom", "getBetween", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SpacersVO {
        private final int between;
        private final int bottom;
        private final int left;
        private final int right;
        private final int top;

        public SpacersVO(int i11, int i12, int i13, int i14, int i15) {
            this.left = i11;
            this.right = i12;
            this.top = i13;
            this.bottom = i14;
            this.between = i15;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpacersVO)) {
                return false;
            }
            SpacersVO spacersVO = (SpacersVO) other;
            return this.left == spacersVO.left && this.right == spacersVO.right && this.top == spacersVO.top && this.bottom == spacersVO.bottom && this.between == spacersVO.between;
        }

        public final int getBetween() {
            return this.between;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getRight() {
            return this.right;
        }

        public final int getTop() {
            return this.top;
        }

        public int hashCode() {
            return Integer.hashCode(this.between) + C2454a.a(this.bottom, C2454a.a(this.top, C2454a.a(this.right, Integer.hashCode(this.left) * 31, 31), 31), 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.left;
            int i12 = this.right;
            int i13 = this.top;
            int i14 = this.bottom;
            int i15 = this.between;
            StringBuilder a11 = C2438a.a("SpacersVO(left=", i11, ", right=", ", top=", i12);
            a.f(i13, i14, ", bottom=", ", between=", a11);
            return b.e(i15, ")", a11);
        }
    }

    public TagListVO(long j11, @NotNull List<TagButtonDTO> tags, String str, @NotNull SpacersVO spacers, t tVar) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(spacers, "spacers");
        this.id = j11;
        this.tags = tags;
        this.backgroundColor = str;
        this.spacers = spacers;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TagListVO)) {
            return false;
        }
        TagListVO tagListVO = (TagListVO) other;
        return this.id == tagListVO.id && Intrinsics.d(this.tags, tagListVO.tags) && Intrinsics.d(this.backgroundColor, tagListVO.backgroundColor) && Intrinsics.d(this.spacers, tagListVO.spacers) && Intrinsics.d(this.tokenizedEvent, tagListVO.tokenizedEvent);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final SpacersVO getSpacers() {
        return this.spacers;
    }

    @NotNull
    public final List<TagButtonDTO> getTags() {
        return this.tags;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.tags);
        String str = this.backgroundColor;
        int hashCode = (this.spacers.hashCode() + ((b11 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<TagButtonDTO> list = this.tags;
        String str = this.backgroundColor;
        SpacersVO spacersVO = this.spacers;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = Lh.b.b(j11, "TagListVO(id=", ", tags=", list);
        b11.append(", backgroundColor=");
        b11.append(str);
        b11.append(", spacers=");
        b11.append(spacersVO);
        return Lh.a.b(b11, ", tokenizedEvent=", tVar, ")");
    }
}
