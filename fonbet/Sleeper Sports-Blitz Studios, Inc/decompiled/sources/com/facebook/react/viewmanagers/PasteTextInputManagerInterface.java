package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* loaded from: classes6.dex */
public interface PasteTextInputManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void blur(T t);

    void focus(T t);

    void setAllowFontScaling(T t, boolean z);

    void setAutoCapitalize(T t, String str);

    void setAutoComplete(T t, String str);

    void setAutoCorrect(T t, boolean z);

    void setAutoFocus(T t, boolean z);

    void setBlurOnSubmit(T t, boolean z);

    void setCaretHidden(T t, boolean z);

    void setClearButtonMode(T t, String str);

    void setClearTextOnFocus(T t, boolean z);

    void setColor(T t, int i);

    void setContextMenuHidden(T t, boolean z);

    void setCursorColor(T t, Integer num);

    void setDefaultValue(T t, String str);

    void setDisableCopyPaste(T t, boolean z);

    void setDisableFullscreenUI(T t, boolean z);

    void setEditable(T t, boolean z);

    void setEnablesReturnKeyAutomatically(T t, boolean z);

    void setFontFamily(T t, String str);

    void setFontSize(T t, float f);

    void setFontStyle(T t, String str);

    void setFontWeight(T t, String str);

    void setImportantForAutofill(T t, String str);

    void setIncludeFontPadding(T t, boolean z);

    void setInlineImageLeft(T t, String str);

    void setInlineImagePadding(T t, int i);

    void setInputAccessoryViewID(T t, String str);

    void setKeyboardAppearance(T t, String str);

    void setKeyboardType(T t, String str);

    void setLetterSpacing(T t, float f);

    void setLineHeight(T t, float f);

    void setMaxFontSizeMultiplier(T t, float f);

    void setMaxLength(T t, int i);

    void setMostRecentEventCount(T t, int i);

    void setMultiline(T t, boolean z);

    void setNumberOfLines(T t, int i);

    void setPasswordRules(T t, String str);

    void setPlaceholder(T t, String str);

    void setPlaceholderTextColor(T t, Integer num);

    void setReturnKeyLabel(T t, String str);

    void setReturnKeyType(T t, String str);

    void setScrollEnabled(T t, boolean z);

    void setSecureTextEntry(T t, boolean z);

    void setSelectTextOnFocus(T t, boolean z);

    void setSelection(T t, ReadableMap readableMap);

    void setSelectionColor(T t, Integer num);

    void setSelectionHandleColor(T t, Integer num);

    void setShowSoftInputOnFocus(T t, boolean z);

    void setSmartInsertDelete(T t, boolean z);

    void setSmartPunctuation(T t, String str);

    void setSpellCheck(T t, boolean z);

    void setSubmitBehavior(T t, String str);

    void setText(T t, String str);

    void setTextAlign(T t, String str);

    void setTextAlignVertical(T t, String str);

    void setTextAndSelection(T t, int i, String str, int i2, int i3);

    void setTextBreakStrategy(T t, String str);

    void setTextContentType(T t, String str);

    void setTextDecorationLine(T t, String str);

    void setTextShadowColor(T t, Integer num);

    void setTextShadowOffset(T t, ReadableMap readableMap);

    void setTextShadowRadius(T t, float f);

    void setTextTransform(T t, String str);

    void setUnderlineColorAndroid(T t, Integer num);

    void setValue(T t, String str);
}
