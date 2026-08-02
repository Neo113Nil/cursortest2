package ru.ozon.app.android.travel.molecules.view.starsBadge.v1;

import N3.C3660k;
import Ns.b;
import WZ.t;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/starsBadge/v1/StarsBadgeVI;", "", "", "text", "leftIcon", "rightIcon", "backgroundColor", "", "textGradientColors", "Lru/ozon/uni/atoms/af/AtomAction;", "common", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[ILru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getText", "getLeftIcon", "getRightIcon", "getBackgroundColor", "[I", "getTextGradientColors", "()[I", "Lru/ozon/uni/atoms/af/AtomAction;", "getCommon", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StarsBadgeVI {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final AtomAction common;
    private final String leftIcon;
    private final String rightIcon;

    @NotNull
    private final String text;

    @NotNull
    private final int[] textGradientColors;
    private final t tokenizedEvent;

    public StarsBadgeVI(@NotNull String text, String str, String str2, String str3, @NotNull int[] textGradientColors, AtomAction atomAction, t tVar) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textGradientColors, "textGradientColors");
        this.text = text;
        this.leftIcon = str;
        this.rightIcon = str2;
        this.backgroundColor = str3;
        this.textGradientColors = textGradientColors;
        this.common = atomAction;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!StarsBadgeVI.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.g(other, "null cannot be cast to non-null type ru.ozon.app.android.travel.molecules.view.starsBadge.v1.StarsBadgeVI");
        StarsBadgeVI starsBadgeVI = (StarsBadgeVI) other;
        return Intrinsics.d(this.text, starsBadgeVI.text) && Intrinsics.d(this.leftIcon, starsBadgeVI.leftIcon) && Intrinsics.d(this.rightIcon, starsBadgeVI.rightIcon) && Intrinsics.d(this.backgroundColor, starsBadgeVI.backgroundColor) && Arrays.equals(this.textGradientColors, starsBadgeVI.textGradientColors) && Intrinsics.d(this.common, starsBadgeVI.common);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final AtomAction getCommon() {
        return this.common;
    }

    public final String getLeftIcon() {
        return this.leftIcon;
    }

    public final String getRightIcon() {
        return this.rightIcon;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final int[] getTextGradientColors() {
        return this.textGradientColors;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.leftIcon;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.rightIcon;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.backgroundColor;
        int hashCode4 = (Arrays.hashCode(this.textGradientColors) + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31;
        AtomAction atomAction = this.common;
        return hashCode4 + (atomAction != null ? atomAction.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.leftIcon;
        String str3 = this.rightIcon;
        String str4 = this.backgroundColor;
        String arrays = Arrays.toString(this.textGradientColors);
        AtomAction atomAction = this.common;
        t tVar = this.tokenizedEvent;
        StringBuilder d11 = C3660k.d("StarsBadgeVI(text=", str, ", leftIcon=", str2, ", rightIcon=");
        Nh.a.h(d11, str3, ", backgroundColor=", str4, ", textGradientColors=");
        b.d(arrays, ", common=", ", tokenizedEvent=", d11, atomAction);
        return Tl.b.d(d11, tVar, ")");
    }
}
