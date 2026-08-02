package ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation;

import Ns.b;
import TY.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.data.AddEdoDTOV2;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoFormVOV2;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/data/AddEdoDTOV2$InputField;", "inputField", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "annotation", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/data/AddEdoDTOV2$InputField;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/data/AddEdoDTOV2$InputField;", "getInputField", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/data/AddEdoDTOV2$InputField;", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getAnnotation", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddEdoFormVOV2 implements c {
    private final DisclaimerAtom annotation;
    private final long id;

    @NotNull
    private final AddEdoDTOV2.InputField inputField;

    @NotNull
    private final TextDTO title;

    public AddEdoFormVOV2(long j11, @NotNull TextDTO title, @NotNull AddEdoDTOV2.InputField inputField, DisclaimerAtom disclaimerAtom) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(inputField, "inputField");
        this.id = j11;
        this.title = title;
        this.inputField = inputField;
        this.annotation = disclaimerAtom;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddEdoFormVOV2)) {
            return false;
        }
        AddEdoFormVOV2 addEdoFormVOV2 = (AddEdoFormVOV2) other;
        return this.id == addEdoFormVOV2.id && Intrinsics.d(this.title, addEdoFormVOV2.title) && Intrinsics.d(this.inputField, addEdoFormVOV2.inputField) && Intrinsics.d(this.annotation, addEdoFormVOV2.annotation);
    }

    public final DisclaimerAtom getAnnotation() {
        return this.annotation;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final AddEdoDTOV2.InputField getInputField() {
        return this.inputField;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.inputField.hashCode() + b.a(this.title, Long.hashCode(this.id) * 31, 31)) * 31;
        DisclaimerAtom disclaimerAtom = this.annotation;
        return hashCode + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        AddEdoDTOV2.InputField inputField = this.inputField;
        DisclaimerAtom disclaimerAtom = this.annotation;
        StringBuilder b11 = a.b("AddEdoFormVOV2(id=", j11, ", title=", textDTO);
        b11.append(", inputField=");
        b11.append(inputField);
        b11.append(", annotation=");
        b11.append(disclaimerAtom);
        b11.append(")");
        return b11.toString();
    }
}
