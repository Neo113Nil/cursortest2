package ru.ozon.app.android.ugc.core.widgets.illustrationButtons.presentation;

import B90.C2616s;
import C.o0;
import N3.C3660k;
import Nh.a;
import Ns.b;
import WZ.t;
import Z1.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00020\u0001:\u0002()B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/presentation/IllustrationButtonsVO;", "Ll20/c;", "", "id", "Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/presentation/IllustrationButtonsVO$ButtonVO;", "leftButton", "rightButton", "", "backgroundColor", "Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/presentation/IllustrationButtonsVO$PaddingsVO;", "paddings", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/ugc/core/widgets/illustrationButtons/presentation/IllustrationButtonsVO$ButtonVO;Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/presentation/IllustrationButtonsVO$ButtonVO;Ljava/lang/String;Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/presentation/IllustrationButtonsVO$PaddingsVO;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/presentation/IllustrationButtonsVO$ButtonVO;", "getLeftButton", "()Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/presentation/IllustrationButtonsVO$ButtonVO;", "getRightButton", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/presentation/IllustrationButtonsVO$PaddingsVO;", "getPaddings", "()Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/presentation/IllustrationButtonsVO$PaddingsVO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "ButtonVO", "PaddingsVO", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class IllustrationButtonsVO implements c {
    private final String backgroundColor;
    private final long id;

    @NotNull
    private final ButtonVO leftButton;

    @NotNull
    private final PaddingsVO paddings;

    @NotNull
    private final ButtonVO rightButton;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/presentation/IllustrationButtonsVO$ButtonVO;", "", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "backgroundColor", "LZ1/h;", "cornerRadius", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;FLru/ozon/uni/atoms/af/AtomAction;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getBackgroundColor", "F", "getCornerRadius-D9Ej5fM", "()F", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonVO {
        private final AtomAction action;
        private final String backgroundColor;
        private final float cornerRadius;

        @NotNull
        private final ImageDTO image;

        @NotNull
        private final TextDTO title;

        public /* synthetic */ ButtonVO(ImageDTO imageDTO, TextDTO textDTO, String str, float f7, AtomAction atomAction, DefaultConstructorMarker defaultConstructorMarker) {
            this(imageDTO, textDTO, str, f7, atomAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonVO)) {
                return false;
            }
            ButtonVO buttonVO = (ButtonVO) other;
            return Intrinsics.d(this.image, buttonVO.image) && Intrinsics.d(this.title, buttonVO.title) && Intrinsics.d(this.backgroundColor, buttonVO.backgroundColor) && h.b(this.cornerRadius, buttonVO.cornerRadius) && Intrinsics.d(this.action, buttonVO.action);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: getCornerRadius-D9Ej5fM, reason: not valid java name and from getter */
        public final float getCornerRadius() {
            return this.cornerRadius;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int a11 = b.a(this.title, this.image.hashCode() * 31, 31);
            String str = this.backgroundColor;
            int a12 = Pk0.b.a(this.cornerRadius, (a11 + (str == null ? 0 : str.hashCode())) * 31, 31);
            AtomAction atomAction = this.action;
            return a12 + (atomAction != null ? atomAction.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ImageDTO imageDTO = this.image;
            TextDTO textDTO = this.title;
            String str = this.backgroundColor;
            String c11 = h.c(this.cornerRadius);
            AtomAction atomAction = this.action;
            StringBuilder d11 = C2616s.d("ButtonVO(image=", imageDTO, ", title=", textDTO, ", backgroundColor=");
            a.h(d11, str, ", cornerRadius=", c11, ", action=");
            return B6.b.b(d11, atomAction, ")");
        }

        private ButtonVO(ImageDTO image, TextDTO title, String str, float f7, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            this.image = image;
            this.title = title;
            this.backgroundColor = str;
            this.cornerRadius = f7;
            this.action = atomAction;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/presentation/IllustrationButtonsVO$PaddingsVO;", "", "LZ1/h;", "topPadding", "bottomPadding", "leftPadding", "rightPadding", "buttonsPadding", "<init>", "(FFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getTopPadding-D9Ej5fM", "()F", "getBottomPadding-D9Ej5fM", "getLeftPadding-D9Ej5fM", "getRightPadding-D9Ej5fM", "getButtonsPadding-D9Ej5fM", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaddingsVO {
        private final float bottomPadding;
        private final float buttonsPadding;
        private final float leftPadding;
        private final float rightPadding;
        private final float topPadding;

        public /* synthetic */ PaddingsVO(float f7, float f11, float f12, float f13, float f14, DefaultConstructorMarker defaultConstructorMarker) {
            this(f7, f11, f12, f13, f14);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaddingsVO)) {
                return false;
            }
            PaddingsVO paddingsVO = (PaddingsVO) other;
            return h.b(this.topPadding, paddingsVO.topPadding) && h.b(this.bottomPadding, paddingsVO.bottomPadding) && h.b(this.leftPadding, paddingsVO.leftPadding) && h.b(this.rightPadding, paddingsVO.rightPadding) && h.b(this.buttonsPadding, paddingsVO.buttonsPadding);
        }

        /* renamed from: getBottomPadding-D9Ej5fM, reason: not valid java name and from getter */
        public final float getBottomPadding() {
            return this.bottomPadding;
        }

        /* renamed from: getButtonsPadding-D9Ej5fM, reason: not valid java name and from getter */
        public final float getButtonsPadding() {
            return this.buttonsPadding;
        }

        /* renamed from: getLeftPadding-D9Ej5fM, reason: not valid java name and from getter */
        public final float getLeftPadding() {
            return this.leftPadding;
        }

        /* renamed from: getRightPadding-D9Ej5fM, reason: not valid java name and from getter */
        public final float getRightPadding() {
            return this.rightPadding;
        }

        /* renamed from: getTopPadding-D9Ej5fM, reason: not valid java name and from getter */
        public final float getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            return Float.hashCode(this.buttonsPadding) + Pk0.b.a(this.rightPadding, Pk0.b.a(this.leftPadding, Pk0.b.a(this.bottomPadding, Float.hashCode(this.topPadding) * 31, 31), 31), 31);
        }

        @NotNull
        public String toString() {
            String c11 = h.c(this.topPadding);
            String c12 = h.c(this.bottomPadding);
            String c13 = h.c(this.leftPadding);
            String c14 = h.c(this.rightPadding);
            String c15 = h.c(this.buttonsPadding);
            StringBuilder d11 = C3660k.d("PaddingsVO(topPadding=", c11, ", bottomPadding=", c12, ", leftPadding=");
            a.h(d11, c13, ", rightPadding=", c14, ", buttonsPadding=");
            return o0.c(d11, c15, ")");
        }

        private PaddingsVO(float f7, float f11, float f12, float f13, float f14) {
            this.topPadding = f7;
            this.bottomPadding = f11;
            this.leftPadding = f12;
            this.rightPadding = f13;
            this.buttonsPadding = f14;
        }
    }

    public IllustrationButtonsVO(long j11, @NotNull ButtonVO leftButton, @NotNull ButtonVO rightButton, String str, @NotNull PaddingsVO paddings, t tVar) {
        Intrinsics.checkNotNullParameter(leftButton, "leftButton");
        Intrinsics.checkNotNullParameter(rightButton, "rightButton");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = j11;
        this.leftButton = leftButton;
        this.rightButton = rightButton;
        this.backgroundColor = str;
        this.paddings = paddings;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IllustrationButtonsVO)) {
            return false;
        }
        IllustrationButtonsVO illustrationButtonsVO = (IllustrationButtonsVO) other;
        return this.id == illustrationButtonsVO.id && Intrinsics.d(this.leftButton, illustrationButtonsVO.leftButton) && Intrinsics.d(this.rightButton, illustrationButtonsVO.rightButton) && Intrinsics.d(this.backgroundColor, illustrationButtonsVO.backgroundColor) && Intrinsics.d(this.paddings, illustrationButtonsVO.paddings) && Intrinsics.d(this.tokenizedEvent, illustrationButtonsVO.tokenizedEvent);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ButtonVO getLeftButton() {
        return this.leftButton;
    }

    @NotNull
    public final PaddingsVO getPaddings() {
        return this.paddings;
    }

    @NotNull
    public final ButtonVO getRightButton() {
        return this.rightButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.rightButton.hashCode() + ((this.leftButton.hashCode() + (Long.hashCode(this.id) * 31)) * 31)) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (this.paddings.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "IllustrationButtonsVO(id=" + this.id + ", leftButton=" + this.leftButton + ", rightButton=" + this.rightButton + ", backgroundColor=" + this.backgroundColor + ", paddings=" + this.paddings + ", tokenizedEvent=" + this.tokenizedEvent + ")";
    }
}
