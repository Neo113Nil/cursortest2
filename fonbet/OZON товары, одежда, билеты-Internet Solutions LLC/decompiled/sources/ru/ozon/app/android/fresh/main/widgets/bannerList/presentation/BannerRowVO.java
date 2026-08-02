package ru.ozon.app.android.fresh.main.widgets.bannerList.presentation;

import WZ.t;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001-B]\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b&\u0010%R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b(\u0010)R\u001f\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/bannerList/presentation/BannerRowVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "image", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "background", "", "indexOfList", "lastIndex", "Lru/ozon/app/android/fresh/main/widgets/bannerList/presentation/BannerRowVO$RoundedCorners;", "roundedCorners", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;IILru/ozon/app/android/fresh/main/widgets/bannerList/presentation/BannerRowVO$RoundedCorners;LWZ/t;)V", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/lang/String;", "getImage", "()Ljava/lang/String;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getBackground", "I", "getIndexOfList", "()I", "getLastIndex", "Lru/ozon/app/android/fresh/main/widgets/bannerList/presentation/BannerRowVO$RoundedCorners;", "getRoundedCorners", "()Lru/ozon/app/android/fresh/main/widgets/bannerList/presentation/BannerRowVO$RoundedCorners;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "RoundedCorners", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BannerRowVO implements c {
    private final AtomAction action;
    private final String background;
    private final long id;

    @NotNull
    private final String image;
    private final int indexOfList;
    private final int lastIndex;
    private final RoundedCorners roundedCorners;

    @NotNull
    private final TextAtom title;
    private final t tokenizedEvent;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/bannerList/presentation/BannerRowVO$RoundedCorners;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "FULL", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RoundedCorners {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ RoundedCorners[] $VALUES;
        public static final RoundedCorners TOP = new RoundedCorners("TOP", 0);
        public static final RoundedCorners BOTTOM = new RoundedCorners("BOTTOM", 1);
        public static final RoundedCorners FULL = new RoundedCorners("FULL", 2);

        private static final /* synthetic */ RoundedCorners[] $values() {
            return new RoundedCorners[]{TOP, BOTTOM, FULL};
        }

        static {
            RoundedCorners[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private RoundedCorners(String str, int i11) {
        }

        public static RoundedCorners valueOf(String str) {
            return (RoundedCorners) Enum.valueOf(RoundedCorners.class, str);
        }

        public static RoundedCorners[] values() {
            return (RoundedCorners[]) $VALUES.clone();
        }
    }

    public BannerRowVO(long j11, @NotNull TextAtom title, @NotNull String image, AtomAction atomAction, String str, int i11, int i12, RoundedCorners roundedCorners, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        this.id = j11;
        this.title = title;
        this.image = image;
        this.action = atomAction;
        this.background = str;
        this.indexOfList = i11;
        this.lastIndex = i12;
        this.roundedCorners = roundedCorners;
        this.tokenizedEvent = tVar;
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final String getBackground() {
        return this.background;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    public final int getIndexOfList() {
        return this.indexOfList;
    }

    public final int getLastIndex() {
        return this.lastIndex;
    }

    public final RoundedCorners getRoundedCorners() {
        return this.roundedCorners;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }
}
