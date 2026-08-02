package ru.ozon.app.android.storefront.stories.setOfPreviews.data;

import Ak.C2436a;
import G.g;
import Nh.a;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.stories.setContainer.data.CommonVoSet;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJL\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b!\u0010\u0013R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/storefront/stories/setOfPreviews/data/SetOfPreviewsVO;", "Lru/ozon/app/android/storefront/stories/setContainer/data/CommonVoSet;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "Lru/ozon/app/android/storefront/stories/setOfPreviews/data/PreviewItemVO;", "previews", "Landroid/os/Parcelable;", "scrollState", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Landroid/os/Parcelable;)V", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Landroid/os/Parcelable;)Lru/ozon/app/android/storefront/stories/setOfPreviews/data/SetOfPreviewsVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "getSubtitle", "Ljava/util/List;", "getPreviews", "()Ljava/util/List;", "Landroid/os/Parcelable;", "getScrollState", "()Landroid/os/Parcelable;", "setScrollState", "(Landroid/os/Parcelable;)V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SetOfPreviewsVO implements CommonVoSet, c {
    private final long id;

    @NotNull
    private final List<PreviewItemVO> previews;
    private Parcelable scrollState;
    private final String subtitle;

    @NotNull
    private final String title;

    public SetOfPreviewsVO(long j11, @NotNull String title, String str, @NotNull List<PreviewItemVO> previews, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(previews, "previews");
        this.id = j11;
        this.title = title;
        this.subtitle = str;
        this.previews = previews;
        this.scrollState = parcelable;
    }

    public static /* synthetic */ SetOfPreviewsVO copy$default(SetOfPreviewsVO setOfPreviewsVO, long j11, String str, String str2, List list, Parcelable parcelable, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = setOfPreviewsVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = setOfPreviewsVO.title;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            str2 = setOfPreviewsVO.subtitle;
        }
        String str4 = str2;
        if ((i11 & 8) != 0) {
            list = setOfPreviewsVO.previews;
        }
        List list2 = list;
        if ((i11 & 16) != 0) {
            parcelable = setOfPreviewsVO.scrollState;
        }
        return setOfPreviewsVO.copy(j12, str3, str4, list2, parcelable);
    }

    @NotNull
    public final SetOfPreviewsVO copy(long id2, @NotNull String title, String subtitle, @NotNull List<PreviewItemVO> previews, Parcelable scrollState) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(previews, "previews");
        return new SetOfPreviewsVO(id2, title, subtitle, previews, scrollState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetOfPreviewsVO)) {
            return false;
        }
        SetOfPreviewsVO setOfPreviewsVO = (SetOfPreviewsVO) other;
        return this.id == setOfPreviewsVO.id && Intrinsics.d(this.title, setOfPreviewsVO.title) && Intrinsics.d(this.subtitle, setOfPreviewsVO.subtitle) && Intrinsics.d(this.previews, setOfPreviewsVO.previews) && Intrinsics.d(this.scrollState, setOfPreviewsVO.scrollState);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // ru.ozon.app.android.storefront.stories.setContainer.data.CommonVoSet
    @NotNull
    public List<PreviewItemVO> getPreviews() {
        return this.previews;
    }

    @Override // ru.ozon.app.android.storefront.stories.setContainer.data.CommonVoSet
    public Parcelable getScrollState() {
        return this.scrollState;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return CommonVoSet.DefaultImpls.getScrollWidgetKey(this);
    }

    @Override // ru.ozon.app.android.storefront.stories.setContainer.data.CommonVoSet
    public String getSubtitle() {
        return this.subtitle;
    }

    @Override // ru.ozon.app.android.storefront.stories.setContainer.data.CommonVoSet
    @NotNull
    public String getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return CommonVoSet.DefaultImpls.getViewItemKey(this);
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.title);
        String str = this.subtitle;
        int b11 = g.b((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.previews);
        Parcelable parcelable = this.scrollState;
        return b11 + (parcelable != null ? parcelable.hashCode() : 0);
    }

    @Override // ru.ozon.app.android.storefront.stories.setContainer.data.CommonVoSet
    public void setScrollState(Parcelable parcelable) {
        this.scrollState = parcelable;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        String str2 = this.subtitle;
        List<PreviewItemVO> list = this.previews;
        Parcelable parcelable = this.scrollState;
        StringBuilder c11 = C2436a.c(j11, "SetOfPreviewsVO(id=", ", title=", str);
        a.g(", subtitle=", str2, ", previews=", c11, list);
        c11.append(", scrollState=");
        c11.append(parcelable);
        c11.append(")");
        return c11.toString();
    }

    public /* synthetic */ SetOfPreviewsVO(long j11, String str, String str2, List list, Parcelable parcelable, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, str, str2, list, (i11 & 16) != 0 ? null : parcelable);
    }
}
