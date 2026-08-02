package ru.ozon.app.android.pdpoldwidgets.widgets.caption.presentation;

import Ak.C2436a;
import B0.C2454a;
import T7.P;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.InterfaceC8039a;
import m10.o;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u00032\u00020\u0004B=\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0014R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b,\u0010\u001f\u001a\u0004\b-\u0010\u0014¨\u0006."}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/caption/presentation/CaptionVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lm10/a;", "Lm10/o;", "", "id", "", "image", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "text", "", "backgroundColor", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "LWZ/t;", "event", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;ILru/ozon/uni/atoms/data/AtomActionDTO;LWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getImage", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "I", "getBackgroundColor", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "LWZ/t;", "getEvent", "()LWZ/t;", "widgetName", "getWidgetName", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CaptionVO implements c, InterfaceC8039a, o {
    private final AtomActionDTO action;
    private final int backgroundColor;
    private final t event;
    private final long id;
    private final String image;

    @NotNull
    private final OzonSpannableString text;

    @NotNull
    private final String widgetName;

    public CaptionVO(long j11, String str, @NotNull OzonSpannableString text, int i11, AtomActionDTO atomActionDTO, t tVar) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.id = j11;
        this.image = str;
        this.text = text;
        this.backgroundColor = i11;
        this.action = atomActionDTO;
        this.event = tVar;
        this.widgetName = "pdp_product";
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CaptionVO)) {
            return false;
        }
        CaptionVO captionVO = (CaptionVO) other;
        return this.id == captionVO.id && Intrinsics.d(this.image, captionVO.image) && Intrinsics.d(this.text, captionVO.text) && this.backgroundColor == captionVO.backgroundColor && Intrinsics.d(this.action, captionVO.action) && Intrinsics.d(this.event, captionVO.event);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final t getEvent() {
        return this.event;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final String getImage() {
        return this.image;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final OzonSpannableString getText() {
        return this.text;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    @Override // m10.o
    @NotNull
    public String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.image;
        int a11 = C2454a.a(this.backgroundColor, P.c(this.text, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        AtomActionDTO atomActionDTO = this.action;
        int hashCode2 = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        t tVar = this.event;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.image;
        OzonSpannableString ozonSpannableString = this.text;
        int i11 = this.backgroundColor;
        AtomActionDTO atomActionDTO = this.action;
        t tVar = this.event;
        StringBuilder c11 = C2436a.c(j11, "CaptionVO(id=", ", image=", str);
        c11.append(", text=");
        c11.append((Object) ozonSpannableString);
        c11.append(", backgroundColor=");
        c11.append(i11);
        c11.append(", action=");
        c11.append(atomActionDTO);
        c11.append(", event=");
        c11.append(tVar);
        c11.append(")");
        return c11.toString();
    }
}
