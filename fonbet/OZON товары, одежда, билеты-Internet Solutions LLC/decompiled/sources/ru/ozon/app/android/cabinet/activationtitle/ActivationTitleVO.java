package ru.ozon.app.android.cabinet.activationtitle;

import Ak.C2436a;
import G.g;
import Nh.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001d\u0010\u000eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001e\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001f\u0010\u000e¨\u0006 "}, d2 = {"Lru/ozon/app/android/cabinet/activationtitle/ActivationTitleVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, HammersV3BodyDTO.PLACEHOLDER, "buttonTitle", "description", "code", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "getPlaceholder", "getButtonTitle", "getDescription", "getCode", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ActivationTitleVO implements c {

    @NotNull
    private final String buttonTitle;
    private final String code;
    private final String description;
    private final long id;

    @NotNull
    private final String placeholder;

    @NotNull
    private final String title;

    public ActivationTitleVO(long j11, @NotNull String title, @NotNull String placeholder, @NotNull String buttonTitle, String str, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.id = j11;
        this.title = title;
        this.placeholder = placeholder;
        this.buttonTitle = buttonTitle;
        this.description = str;
        this.code = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivationTitleVO)) {
            return false;
        }
        ActivationTitleVO activationTitleVO = (ActivationTitleVO) other;
        return this.id == activationTitleVO.id && Intrinsics.d(this.title, activationTitleVO.title) && Intrinsics.d(this.placeholder, activationTitleVO.placeholder) && Intrinsics.d(this.buttonTitle, activationTitleVO.buttonTitle) && Intrinsics.d(this.description, activationTitleVO.description) && Intrinsics.d(this.code, activationTitleVO.code);
    }

    @NotNull
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(g.a(g.a(Long.hashCode(this.id) * 31, 31, this.title), 31, this.placeholder), 31, this.buttonTitle);
        String str = this.description;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.code;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        String str2 = this.placeholder;
        String str3 = this.buttonTitle;
        String str4 = this.description;
        String str5 = this.code;
        StringBuilder c11 = C2436a.c(j11, "ActivationTitleVO(id=", ", title=", str);
        a.h(c11, ", placeholder=", str2, ", buttonTitle=", str3);
        a.h(c11, ", description=", str4, ", code=", str5);
        c11.append(")");
        return c11.toString();
    }
}
