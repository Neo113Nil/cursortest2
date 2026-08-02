package ru.ozon.app.android.geo.addresseditformprompt.presentation;

import B0.C2454a;
import G.g;
import Lh.a;
import Lh.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetFragment;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\u0014R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/geo/addresseditformprompt/presentation/AddressEditFormPromptVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "elements", "", "firstButtonPosition", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;", "options", "LWZ/t;", "tokenizedEvent", "<init>", "(JLjava/util/List;ILru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getElements", "()Ljava/util/List;", "I", "getFirstButtonPosition", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;", "getOptions", "()Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddressEditFormPromptVO implements c {

    @NotNull
    private final List<AtomDTO> elements;
    private final int firstButtonPosition;
    private final long id;
    private final YandexSearchSheetFragment.Data options;
    private final t tokenizedEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public AddressEditFormPromptVO(long j11, @NotNull List<? extends AtomDTO> elements, int i11, YandexSearchSheetFragment.Data data, t tVar) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.id = j11;
        this.elements = elements;
        this.firstButtonPosition = i11;
        this.options = data;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressEditFormPromptVO)) {
            return false;
        }
        AddressEditFormPromptVO addressEditFormPromptVO = (AddressEditFormPromptVO) other;
        return this.id == addressEditFormPromptVO.id && Intrinsics.d(this.elements, addressEditFormPromptVO.elements) && this.firstButtonPosition == addressEditFormPromptVO.firstButtonPosition && Intrinsics.d(this.options, addressEditFormPromptVO.options) && Intrinsics.d(this.tokenizedEvent, addressEditFormPromptVO.tokenizedEvent);
    }

    @NotNull
    public final List<AtomDTO> getElements() {
        return this.elements;
    }

    public final int getFirstButtonPosition() {
        return this.firstButtonPosition;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final YandexSearchSheetFragment.Data getOptions() {
        return this.options;
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
        int a11 = C2454a.a(this.firstButtonPosition, g.b(Long.hashCode(this.id) * 31, 31, this.elements), 31);
        YandexSearchSheetFragment.Data data = this.options;
        int hashCode = (a11 + (data == null ? 0 : data.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<AtomDTO> list = this.elements;
        int i11 = this.firstButtonPosition;
        YandexSearchSheetFragment.Data data = this.options;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = b.b(j11, "AddressEditFormPromptVO(id=", ", elements=", list);
        b11.append(", firstButtonPosition=");
        b11.append(i11);
        b11.append(", options=");
        b11.append(data);
        return a.b(b11, ", tokenizedEvent=", tVar, ")");
    }
}
