package ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling;

import N10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.taglist.taglistv3.data.TagListV3DTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR6\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u00060\u0010j\u0002`\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/common/taglist/taglistv3/presentation/scrolling/StickyScrollingTagListV3ViewMapper;", "Lru/ozon/app/android/common/taglist/taglistv3/presentation/scrolling/ScrollingTagListV3ViewMapper;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "LN10/h;", "stickyWidgetConfig", "LN10/h;", "getStickyWidgetConfig", "()LN10/h;", "Lkotlin/Function2;", "Lru/ozon/app/android/common/taglist/taglistv3/data/TagListV3DTO;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "Lru/ozon/app/android/common/taglist/taglistv3/presentation/scrolling/ScrollingTagListV3VO;", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Companion", "taglist_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StickyScrollingTagListV3ViewMapper extends ScrollingTagListV3ViewMapper {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function2<TagListV3DTO, d, List<ScrollingTagListV3VO>> mapper;

    @NotNull
    private final h stickyWidgetConfig;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/common/taglist/taglistv3/presentation/scrolling/StickyScrollingTagListV3ViewMapper$Companion;", "", "<init>", "()V", "STICKY_TAG", "", "taglist_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public StickyScrollingTagListV3ViewMapper() {
        Intrinsics.checkNotNullParameter("STICKY_TAG", "tag");
        this.stickyWidgetConfig = new h("STICKY_TAG", 6);
        this.mapper = StickyScrollingTagListV3ViewMapper$mapper$1.INSTANCE;
    }

    @Override // ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling.ScrollingTagListV3ViewMapper, ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        TagListV3DTO tagListV3DTO = state instanceof TagListV3DTO ? (TagListV3DTO) state : null;
        return tagListV3DTO != null && Intrinsics.d(tagListV3DTO.isSticky(), Boolean.TRUE) && tagListV3DTO.getStickyBehavior() == TagListV3DTO.StickyBehavior.DEFAULT;
    }

    @Override // ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling.ScrollingTagListV3ViewMapper, ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<TagListV3DTO, d, List<ScrollingTagListV3VO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public h getStickyWidgetConfig() {
        return this.stickyWidgetConfig;
    }
}
