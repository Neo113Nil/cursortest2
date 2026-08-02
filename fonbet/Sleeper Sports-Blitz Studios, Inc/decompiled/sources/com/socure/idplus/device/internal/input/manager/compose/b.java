package com.socure.idplus.device.internal.input.manager.compose;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PlatformTextInputService;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextFieldValueKt;
import com.socure.idplus.device.internal.behavior.model.InputChangeAction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class b implements PlatformTextInputService {

    /* renamed from: a, reason: collision with root package name */
    public final PlatformTextInputService f865a;
    public final /* synthetic */ d b;

    public b(d dVar, PlatformTextInputService platformTextInputService) {
        Intrinsics.checkNotNullParameter(platformTextInputService, "platformTextInputService");
        this.b = dVar;
        this.f865a = platformTextInputService;
    }

    public final void a(int i, TextFieldValue textFieldValue, String str) {
        d dVar;
        String str2;
        int length = str.length() + i;
        if (textFieldValue.getText().length() >= length && Intrinsics.areEqual(textFieldValue.getText().subSequence(i, length).toString(), str) && (str2 = (dVar = this.b).e) != null) {
            dVar.a(textFieldValue.getText(), str2, InputChangeAction.PASTE);
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void hideSoftwareKeyboard() {
        this.f865a.hideSoftwareKeyboard();
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void notifyFocusedRect(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.f865a.notifyFocusedRect(rect);
        d dVar = this.b;
        if (dVar.e == null) {
            dVar.f.set((int) rect.getLeft(), (int) rect.getTop(), (int) rect.getRight(), (int) rect.getBottom());
            d dVar2 = this.b;
            String a2 = dVar2.a(dVar2.f);
            d dVar3 = this.b;
            dVar3.e = a2;
            dVar3.c.a(true);
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void showSoftwareKeyboard() {
        this.f865a.showSoftwareKeyboard();
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void startInput(TextFieldValue value, ImeOptions imeOptions, Function1 onEditCommand, Function1 onImeActionPerformed) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(imeOptions, "imeOptions");
        Intrinsics.checkNotNullParameter(onEditCommand, "onEditCommand");
        Intrinsics.checkNotNullParameter(onImeActionPerformed, "onImeActionPerformed");
        if (this.b.i) {
            this.f865a.startInput(value, imeOptions, new a(this.b, onEditCommand), onImeActionPerformed);
        } else {
            this.f865a.startInput(value, imeOptions, onEditCommand, onImeActionPerformed);
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void stopInput() {
        d dVar = this.b;
        if (!dVar.i) {
            this.f865a.stopInput();
            return;
        }
        if (dVar.e != null) {
            dVar.c.a(false);
        }
        d dVar2 = this.b;
        dVar2.h = null;
        dVar2.e = null;
        this.f865a.stopInput();
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void updateState(TextFieldValue textFieldValue, TextFieldValue newValue) {
        d dVar;
        String str;
        d dVar2;
        String str2;
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        this.f865a.updateState(textFieldValue, newValue);
        d dVar3 = this.b;
        if (dVar3.i && dVar3.e != null) {
            if (!dVar3.b.b) {
                if (textFieldValue == null || Intrinsics.areEqual(dVar3.h, newValue.getText()) || (str = (dVar = this.b).e) == null) {
                    return;
                }
                dVar.a(newValue.getText(), str, InputChangeAction.UNKNOWN);
                return;
            }
            String text = textFieldValue != null ? TextFieldValueKt.getSelectedText(textFieldValue).getText() : null;
            if (text == null) {
                text = "";
            }
            AnnotatedString selectedText = TextFieldValueKt.getSelectedText(newValue);
            String valueOf = String.valueOf(this.b.a());
            if (text.length() <= 0 || selectedText.length() != 0) {
                if (textFieldValue == null) {
                    textFieldValue = new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null);
                }
                if (textFieldValue.getText().length() < newValue.getText().length()) {
                    String valueOf2 = String.valueOf(this.b.a());
                    if (textFieldValue.getText().length() == 0) {
                        a(0, newValue, valueOf2);
                    } else {
                        String text2 = textFieldValue.getText();
                        int i = 0;
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            if (i < text2.length()) {
                                int i4 = i3 + 1;
                                if (text2.charAt(i) != newValue.getText().charAt(i3)) {
                                    a(i3, newValue, valueOf2);
                                    break;
                                } else {
                                    i++;
                                    i2 = i3;
                                    i3 = i4;
                                }
                            } else {
                                int i5 = i2 + 1;
                                if (i5 < newValue.getText().length()) {
                                    a(i5, newValue, valueOf2);
                                }
                            }
                        }
                    }
                }
            } else if (Intrinsics.areEqual(text, valueOf) && (str2 = (dVar2 = this.b).e) != null) {
                dVar2.a(selectedText.getText(), str2, InputChangeAction.CUT);
            }
            this.b.b.b = false;
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Function1 textFieldToRootTransform, Rect innerTextFieldBounds, Rect decorationBoxBounds) {
        Intrinsics.checkNotNullParameter(textFieldValue, "textFieldValue");
        Intrinsics.checkNotNullParameter(offsetMapping, "offsetMapping");
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        Intrinsics.checkNotNullParameter(textFieldToRootTransform, "textFieldToRootTransform");
        Intrinsics.checkNotNullParameter(innerTextFieldBounds, "innerTextFieldBounds");
        Intrinsics.checkNotNullParameter(decorationBoxBounds, "decorationBoxBounds");
        this.f865a.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, textFieldToRootTransform, innerTextFieldBounds, decorationBoxBounds);
    }
}
