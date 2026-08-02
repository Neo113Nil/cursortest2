package androidx.compose.material3.internal;

import android.app.RemoteAction;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class Listener$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ RemoteAction m(Object obj) {
        return (RemoteAction) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AccessibilityManager$AccessibilityServicesStateChangeListener m4270m(Object obj) {
        return (AccessibilityManager$AccessibilityServicesStateChangeListener) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AutofillManager m4271m(Object obj) {
        return (AutofillManager) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AutofillValue m4272m(Object obj) {
        return (AutofillValue) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ DeleteGesture m4273m(Object obj) {
        return (DeleteGesture) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ DeleteRangeGesture m4274m(Object obj) {
        return (DeleteRangeGesture) obj;
    }

    public static /* synthetic */ EditorBoundsInfo.Builder m() {
        return new EditorBoundsInfo.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ HandwritingGesture m4275m(Object obj) {
        return (HandwritingGesture) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ InsertGesture m4276m(Object obj) {
        return (InsertGesture) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ JoinOrSplitGesture m4277m(Object obj) {
        return (JoinOrSplitGesture) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ RemoveSpaceGesture m4278m(Object obj) {
        return (RemoveSpaceGesture) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ SelectGesture m4279m(Object obj) {
        return (SelectGesture) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ SelectRangeGesture m4280m(Object obj) {
        return (SelectRangeGesture) obj;
    }

    public static /* synthetic */ TextClassification.Request.Builder m(CharSequence charSequence, int i, int i2) {
        return new TextClassification.Request.Builder(charSequence, i, i2);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ TextClassification m4282m(Object obj) {
        return (TextClassification) obj;
    }

    public static /* synthetic */ TextClassificationContext.Builder m(String str, String str2) {
        return new TextClassificationContext.Builder(str, str2);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ TextClassificationManager m4283m(Object obj) {
        return (TextClassificationManager) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ TextClassifier m4284m(Object obj) {
        return (TextClassifier) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ TextSelection.Request.Builder m4285m(CharSequence charSequence, int i, int i2) {
        return new TextSelection.Request.Builder(charSequence, i, i2);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ TextSelection m4286m(Object obj) {
        return (TextSelection) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Class m4289m() {
        return SelectGesture.class;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m4293m() {
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ boolean m4296m(Object obj) {
        return obj instanceof InsertGesture;
    }

    public static /* bridge */ /* synthetic */ Class m$1() {
        return SelectRangeGesture.class;
    }

    /* renamed from: m$1, reason: collision with other method in class */
    public static /* synthetic */ void m4297m$1() {
    }

    public static /* bridge */ /* synthetic */ boolean m$1(Object obj) {
        return obj instanceof RemoveSpaceGesture;
    }

    public static /* bridge */ /* synthetic */ Class m$2() {
        return DeleteRangeGesture.class;
    }

    /* renamed from: m$2, reason: collision with other method in class */
    public static /* synthetic */ void m4298m$2() {
    }

    public static /* bridge */ /* synthetic */ boolean m$2(Object obj) {
        return obj instanceof DeleteGesture;
    }

    public static /* bridge */ /* synthetic */ Class m$3() {
        return DeleteGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean m$3(Object obj) {
        return obj instanceof JoinOrSplitGesture;
    }

    public static /* bridge */ /* synthetic */ Class m$4() {
        return JoinOrSplitGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean m$4(Object obj) {
        return obj instanceof SelectGesture;
    }

    public static /* bridge */ /* synthetic */ Class m$5() {
        return InsertGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean m$5(Object obj) {
        return obj instanceof SelectRangeGesture;
    }

    public static /* bridge */ /* synthetic */ Class m$6() {
        return RemoveSpaceGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean m$6(Object obj) {
        return obj instanceof DeleteRangeGesture;
    }

    public static /* bridge */ /* synthetic */ Class m$7() {
        return TextClassificationManager.class;
    }

    public static /* bridge */ /* synthetic */ Class m$8() {
        return AutofillManager.class;
    }
}
