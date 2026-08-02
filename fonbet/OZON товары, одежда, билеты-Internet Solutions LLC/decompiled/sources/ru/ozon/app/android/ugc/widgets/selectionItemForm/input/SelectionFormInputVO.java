package ru.ozon.app.android.ugc.widgets.selectionItemForm.input;

import Ak.C2436a;
import G.g;
import Nh.a;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002Bq\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0090\u0001\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b$\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b%\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b&\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b'\u0010\u0018R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b.\u0010-R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010/\u001a\u0004\b2\u00101R\u001a\u00103\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010-¨\u00066"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/input/SelectionFormInputVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "uploadKey", HammersV3BodyDTO.PLACEHOLDER, "text", "hint", "errorRequiredText", "", "showCounter", "", "maxCounterValue", "maxLinesCount", "LWZ/t;", "tokenizedEvent", "errorViewTokenizedEvent", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;LWZ/t;LWZ/t;)V", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;LWZ/t;LWZ/t;)Lru/ozon/app/android/ugc/widgets/selectionItemForm/input/SelectionFormInputVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getUploadKey", "getPlaceholder", "getText", "getHint", "getErrorRequiredText", "Ljava/lang/Boolean;", "getShowCounter", "()Ljava/lang/Boolean;", "Ljava/lang/Integer;", "getMaxCounterValue", "()Ljava/lang/Integer;", "getMaxLinesCount", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "getErrorViewTokenizedEvent", "scrollWidgetKey", "I", "getScrollWidgetKey", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SelectionFormInputVO implements c {
    private final String errorRequiredText;
    private final t errorViewTokenizedEvent;
    private final String hint;
    private final long id;
    private final Integer maxCounterValue;
    private final Integer maxLinesCount;
    private final String placeholder;
    private final int scrollWidgetKey;
    private final Boolean showCounter;
    private final String text;
    private final t tokenizedEvent;

    @NotNull
    private final String uploadKey;

    public SelectionFormInputVO(long j11, @NotNull String uploadKey, String str, String str2, String str3, String str4, Boolean bool, Integer num, Integer num2, t tVar, t tVar2) {
        Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
        this.id = j11;
        this.uploadKey = uploadKey;
        this.placeholder = str;
        this.text = str2;
        this.hint = str3;
        this.errorRequiredText = str4;
        this.showCounter = bool;
        this.maxCounterValue = num;
        this.maxLinesCount = num2;
        this.tokenizedEvent = tVar;
        this.errorViewTokenizedEvent = tVar2;
        this.scrollWidgetKey = uploadKey.hashCode();
    }

    public static /* synthetic */ SelectionFormInputVO copy$default(SelectionFormInputVO selectionFormInputVO, long j11, String str, String str2, String str3, String str4, String str5, Boolean bool, Integer num, Integer num2, t tVar, t tVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = selectionFormInputVO.id;
        }
        return selectionFormInputVO.copy(j11, (i11 & 2) != 0 ? selectionFormInputVO.uploadKey : str, (i11 & 4) != 0 ? selectionFormInputVO.placeholder : str2, (i11 & 8) != 0 ? selectionFormInputVO.text : str3, (i11 & 16) != 0 ? selectionFormInputVO.hint : str4, (i11 & 32) != 0 ? selectionFormInputVO.errorRequiredText : str5, (i11 & 64) != 0 ? selectionFormInputVO.showCounter : bool, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? selectionFormInputVO.maxCounterValue : num, (i11 & 256) != 0 ? selectionFormInputVO.maxLinesCount : num2, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? selectionFormInputVO.tokenizedEvent : tVar, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? selectionFormInputVO.errorViewTokenizedEvent : tVar2);
    }

    @NotNull
    public final SelectionFormInputVO copy(long id2, @NotNull String uploadKey, String placeholder, String text, String hint, String errorRequiredText, Boolean showCounter, Integer maxCounterValue, Integer maxLinesCount, t tokenizedEvent, t errorViewTokenizedEvent) {
        Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
        return new SelectionFormInputVO(id2, uploadKey, placeholder, text, hint, errorRequiredText, showCounter, maxCounterValue, maxLinesCount, tokenizedEvent, errorViewTokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionFormInputVO)) {
            return false;
        }
        SelectionFormInputVO selectionFormInputVO = (SelectionFormInputVO) other;
        return this.id == selectionFormInputVO.id && Intrinsics.d(this.uploadKey, selectionFormInputVO.uploadKey) && Intrinsics.d(this.placeholder, selectionFormInputVO.placeholder) && Intrinsics.d(this.text, selectionFormInputVO.text) && Intrinsics.d(this.hint, selectionFormInputVO.hint) && Intrinsics.d(this.errorRequiredText, selectionFormInputVO.errorRequiredText) && Intrinsics.d(this.showCounter, selectionFormInputVO.showCounter) && Intrinsics.d(this.maxCounterValue, selectionFormInputVO.maxCounterValue) && Intrinsics.d(this.maxLinesCount, selectionFormInputVO.maxLinesCount) && Intrinsics.d(this.tokenizedEvent, selectionFormInputVO.tokenizedEvent) && Intrinsics.d(this.errorViewTokenizedEvent, selectionFormInputVO.errorViewTokenizedEvent);
    }

    public final String getErrorRequiredText() {
        return this.errorRequiredText;
    }

    public final t getErrorViewTokenizedEvent() {
        return this.errorViewTokenizedEvent;
    }

    public final String getHint() {
        return this.hint;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Integer getMaxCounterValue() {
        return this.maxCounterValue;
    }

    public final Integer getMaxLinesCount() {
        return this.maxLinesCount;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    @Override // l20.c
    @NotNull
    public Integer getScrollWidgetKey() {
        return Integer.valueOf(this.scrollWidgetKey);
    }

    public final Boolean getShowCounter() {
        return this.showCounter;
    }

    public final String getText() {
        return this.text;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @NotNull
    public final String getUploadKey() {
        return this.uploadKey;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.uploadKey);
        String str = this.placeholder;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.hint;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.errorRequiredText;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.showCounter;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.maxCounterValue;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxLinesCount;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode8 = (hashCode7 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        t tVar2 = this.errorViewTokenizedEvent;
        return hashCode8 + (tVar2 != null ? tVar2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.uploadKey;
        String str2 = this.placeholder;
        String str3 = this.text;
        String str4 = this.hint;
        String str5 = this.errorRequiredText;
        Boolean bool = this.showCounter;
        Integer num = this.maxCounterValue;
        Integer num2 = this.maxLinesCount;
        t tVar = this.tokenizedEvent;
        t tVar2 = this.errorViewTokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "SelectionFormInputVO(id=", ", uploadKey=", str);
        a.h(c11, ", placeholder=", str2, ", text=", str3);
        a.h(c11, ", hint=", str4, ", errorRequiredText=", str5);
        c11.append(", showCounter=");
        c11.append(bool);
        c11.append(", maxCounterValue=");
        c11.append(num);
        c11.append(", maxLinesCount=");
        c11.append(num2);
        c11.append(", tokenizedEvent=");
        c11.append(tVar);
        return Lh.a.b(c11, ", errorViewTokenizedEvent=", tVar2, ")");
    }
}
