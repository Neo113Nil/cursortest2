package ru.ozon.app.android.ugc.widgets.usersGrades.data;

import B90.C2619v;
import HY.a;
import J.d;
import Pk0.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/widgets/usersGrades/data/UsersGradesDTO;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "answers", "", "Lru/ozon/app/android/ugc/widgets/usersGrades/data/UsersGradesDTO$Answer;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;)V", "getValue", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getAnswers", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Answer", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UsersGradesDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<Answer> answers;
    private final TextAtom value;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/ugc/widgets/usersGrades/data/UsersGradesDTO$Answer;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "fillPercent", "", "fillLineColor", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;FLjava/lang/String;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getValue", "getFillPercent", "()F", "getFillLineColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Answer {
        public static final int $stable = TextAtom.$stable;
        private final String fillLineColor;
        private final float fillPercent;

        @NotNull
        private final TextAtom title;

        @NotNull
        private final TextAtom value;

        public Answer(@NotNull TextAtom title, @NotNull TextAtom value, float f7, String str) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(value, "value");
            this.title = title;
            this.value = value;
            this.fillPercent = f7;
            this.fillLineColor = str;
        }

        public static /* synthetic */ Answer copy$default(Answer answer, TextAtom textAtom, TextAtom textAtom2, float f7, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = answer.title;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = answer.value;
            }
            if ((i11 & 4) != 0) {
                f7 = answer.fillPercent;
            }
            if ((i11 & 8) != 0) {
                str = answer.fillLineColor;
            }
            return answer.copy(textAtom, textAtom2, f7, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getValue() {
            return this.value;
        }

        /* renamed from: component3, reason: from getter */
        public final float getFillPercent() {
            return this.fillPercent;
        }

        /* renamed from: component4, reason: from getter */
        public final String getFillLineColor() {
            return this.fillLineColor;
        }

        @NotNull
        public final Answer copy(@NotNull TextAtom title, @NotNull TextAtom value, float fillPercent, String fillLineColor) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(value, "value");
            return new Answer(title, value, fillPercent, fillLineColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Answer)) {
                return false;
            }
            Answer answer = (Answer) other;
            return Intrinsics.d(this.title, answer.title) && Intrinsics.d(this.value, answer.value) && Float.compare(this.fillPercent, answer.fillPercent) == 0 && Intrinsics.d(this.fillLineColor, answer.fillLineColor);
        }

        public final String getFillLineColor() {
            return this.fillLineColor;
        }

        public final float getFillPercent() {
            return this.fillPercent;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        public final TextAtom getValue() {
            return this.value;
        }

        public int hashCode() {
            int a11 = b.a(this.fillPercent, C2619v.b(this.title.hashCode() * 31, 31, this.value), 31);
            String str = this.fillLineColor;
            return a11 + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.value;
            float f7 = this.fillPercent;
            String str = this.fillLineColor;
            StringBuilder a11 = a.a("Answer(title=", textAtom, ", value=", textAtom2, ", fillPercent=");
            a11.append(f7);
            a11.append(", fillLineColor=");
            a11.append(str);
            a11.append(")");
            return a11.toString();
        }
    }

    public UsersGradesDTO(TextAtom textAtom, @NotNull List<Answer> answers) {
        Intrinsics.checkNotNullParameter(answers, "answers");
        this.value = textAtom;
        this.answers = answers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UsersGradesDTO copy$default(UsersGradesDTO usersGradesDTO, TextAtom textAtom, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = usersGradesDTO.value;
        }
        if ((i11 & 2) != 0) {
            list = usersGradesDTO.answers;
        }
        return usersGradesDTO.copy(textAtom, list);
    }

    /* renamed from: component1, reason: from getter */
    public final TextAtom getValue() {
        return this.value;
    }

    @NotNull
    public final List<Answer> component2() {
        return this.answers;
    }

    @NotNull
    public final UsersGradesDTO copy(TextAtom value, @NotNull List<Answer> answers) {
        Intrinsics.checkNotNullParameter(answers, "answers");
        return new UsersGradesDTO(value, answers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UsersGradesDTO)) {
            return false;
        }
        UsersGradesDTO usersGradesDTO = (UsersGradesDTO) other;
        return Intrinsics.d(this.value, usersGradesDTO.value) && Intrinsics.d(this.answers, usersGradesDTO.answers);
    }

    @NotNull
    public final List<Answer> getAnswers() {
        return this.answers;
    }

    public final TextAtom getValue() {
        return this.value;
    }

    public int hashCode() {
        TextAtom textAtom = this.value;
        return this.answers.hashCode() + ((textAtom == null ? 0 : textAtom.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return d.c("UsersGradesDTO(value=", this.value, ", answers=", this.answers, ")");
    }
}
