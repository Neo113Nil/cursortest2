package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.PasteTextInputManagerInterface;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.CharUtils;
import org.objectweb.asm.signature.SignatureVisitor;

/* loaded from: classes6.dex */
public class PasteTextInputManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & PasteTextInputManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public PasteTextInputManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t, String str, Object obj) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1896890742:
                if (str.equals("submitBehavior")) {
                    c = 0;
                    break;
                }
                break;
            case -1775748605:
                if (str.equals("placeholderTextColor")) {
                    c = 1;
                    break;
                }
                break;
            case -1715965556:
                if (str.equals("selection")) {
                    c = 2;
                    break;
                }
                break;
            case -1615101171:
                if (str.equals("caretHidden")) {
                    c = 3;
                    break;
                }
                break;
            case -1595747923:
                if (str.equals("cursorColor")) {
                    c = 4;
                    break;
                }
                break;
            case -1573887368:
                if (str.equals("underlineColorAndroid")) {
                    c = 5;
                    break;
                }
                break;
            case -1563136667:
                if (str.equals(ViewProps.TEXT_BREAK_STRATEGY)) {
                    c = 6;
                    break;
                }
                break;
            case -1550943582:
                if (str.equals("fontStyle")) {
                    c = 7;
                    break;
                }
                break;
            case -1542296384:
                if (str.equals("spellCheck")) {
                    c = '\b';
                    break;
                }
                break;
            case -1466439928:
                if (str.equals("inputAccessoryViewID")) {
                    c = '\t';
                    break;
                }
                break;
            case -1339545093:
                if (str.equals("autoCapitalize")) {
                    c = '\n';
                    break;
                }
                break;
            case -1329887265:
                if (str.equals(ViewProps.NUMBER_OF_LINES)) {
                    c = 11;
                    break;
                }
                break;
            case -1293954095:
                if (str.equals("smartPunctuation")) {
                    c = '\f';
                    break;
                }
                break;
            case -1224696685:
                if (str.equals("fontFamily")) {
                    c = CharUtils.CR;
                    break;
                }
                break;
            case -1206239059:
                if (str.equals("multiline")) {
                    c = 14;
                    break;
                }
                break;
            case -1151046732:
                if (str.equals("scrollEnabled")) {
                    c = 15;
                    break;
                }
                break;
            case -1065511464:
                if (str.equals("textAlign")) {
                    c = 16;
                    break;
                }
                break;
            case -1039425002:
                if (str.equals("disableCopyPaste")) {
                    c = 17;
                    break;
                }
                break;
            case -954624085:
                if (str.equals("keyboardAppearance")) {
                    c = 18;
                    break;
                }
                break;
            case -869116834:
                if (str.equals("blurOnSubmit")) {
                    c = 19;
                    break;
                }
                break;
            case -791400086:
                if (str.equals("maxLength")) {
                    c = 20;
                    break;
                }
                break;
            case -773303288:
                if (str.equals("autoComplete")) {
                    c = 21;
                    break;
                }
                break;
            case -734428249:
                if (str.equals("fontWeight")) {
                    c = 22;
                    break;
                }
                break;
            case -700807899:
                if (str.equals("returnKeyLabel")) {
                    c = 23;
                    break;
                }
                break;
            case -659125328:
                if (str.equals("defaultValue")) {
                    c = 24;
                    break;
                }
                break;
            case -637043280:
                if (str.equals("selectTextOnFocus")) {
                    c = 25;
                    break;
                }
                break;
            case -561971132:
                if (str.equals("enablesReturnKeyAutomatically")) {
                    c = 26;
                    break;
                }
                break;
            case -515807685:
                if (str.equals(ViewProps.LINE_HEIGHT)) {
                    c = 27;
                    break;
                }
                break;
            case -435916869:
                if (str.equals("autoCorrect")) {
                    c = 28;
                    break;
                }
                break;
            case -411975134:
                if (str.equals("clearButtonMode")) {
                    c = 29;
                    break;
                }
                break;
            case -407229137:
                if (str.equals(ViewProps.ALLOW_FONT_SCALING)) {
                    c = 30;
                    break;
                }
                break;
            case -299126849:
                if (str.equals("clearTextOnFocus")) {
                    c = 31;
                    break;
                }
                break;
            case -45125393:
                if (str.equals("selectionHandleColor")) {
                    c = ' ';
                    break;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    c = '!';
                    break;
                }
                break;
            case 94842723:
                if (str.equals("color")) {
                    c = '\"';
                    break;
                }
                break;
            case 111972721:
                if (str.equals("value")) {
                    c = '#';
                    break;
                }
                break;
            case 208939969:
                if (str.equals("keyboardType")) {
                    c = '$';
                    break;
                }
                break;
            case 365601008:
                if (str.equals("fontSize")) {
                    c = '%';
                    break;
                }
                break;
            case 397674268:
                if (str.equals("passwordRules")) {
                    c = Typography.amp;
                    break;
                }
                break;
            case 402590253:
                if (str.equals("smartInsertDelete")) {
                    c = '\'';
                    break;
                }
                break;
            case 514055831:
                if (str.equals("disableFullscreenUI")) {
                    c = '(';
                    break;
                }
                break;
            case 548921173:
                if (str.equals(ViewProps.MAX_FONT_SIZE_MULTIPLIER)) {
                    c = ')';
                    break;
                }
                break;
            case 568836494:
                if (str.equals("secureTextEntry")) {
                    c = '*';
                    break;
                }
                break;
            case 578735798:
                if (str.equals("textShadowColor")) {
                    c = SignatureVisitor.EXTENDS;
                    break;
                }
                break;
            case 598246771:
                if (str.equals("placeholder")) {
                    c = AbstractJsonLexerKt.COMMA;
                    break;
                }
                break;
            case 947486441:
                if (str.equals("returnKeyType")) {
                    c = '-';
                    break;
                }
                break;
            case 1096003488:
                if (str.equals("textShadowOffset")) {
                    c = '.';
                    break;
                }
                break;
            case 1139918067:
                if (str.equals("mostRecentEventCount")) {
                    c = IOUtils.DIR_SEPARATOR_UNIX;
                    break;
                }
                break;
            case 1177204639:
                if (str.equals("textShadowRadius")) {
                    c = '0';
                    break;
                }
                break;
            case 1192948249:
                if (str.equals("importantForAutofill")) {
                    c = '1';
                    break;
                }
                break;
            case 1304686953:
                if (str.equals("inlineImageLeft")) {
                    c = '2';
                    break;
                }
                break;
            case 1327548607:
                if (str.equals("textTransform")) {
                    c = '3';
                    break;
                }
                break;
            case 1602416228:
                if (str.equals("editable")) {
                    c = '4';
                    break;
                }
                break;
            case 1638055017:
                if (str.equals("autoFocus")) {
                    c = '5';
                    break;
                }
                break;
            case 1779345382:
                if (str.equals("textContentType")) {
                    c = '6';
                    break;
                }
                break;
            case 1798561528:
                if (str.equals("contextMenuHidden")) {
                    c = '7';
                    break;
                }
                break;
            case 1869416814:
                if (str.equals(ViewProps.TEXT_ALIGN_VERTICAL)) {
                    c = '8';
                    break;
                }
                break;
            case 1908266863:
                if (str.equals("inlineImagePadding")) {
                    c = '9';
                    break;
                }
                break;
            case 1937428854:
                if (str.equals("showSoftInputOnFocus")) {
                    c = AbstractJsonLexerKt.COLON;
                    break;
                }
                break;
            case 2020113146:
                if (str.equals(ViewProps.INCLUDE_FONT_PADDING)) {
                    c = ';';
                    break;
                }
                break;
            case 2031616849:
                if (str.equals(ViewProps.TEXT_DECORATION_LINE)) {
                    c = Typography.less;
                    break;
                }
                break;
            case 2111078717:
                if (str.equals(ViewProps.LETTER_SPACING)) {
                    c = SignatureVisitor.INSTANCEOF;
                    break;
                }
                break;
            case 2142299447:
                if (str.equals("selectionColor")) {
                    c = Typography.greater;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                ((PasteTextInputManagerInterface) this.mViewManager).setSubmitBehavior(t, (String) obj);
                break;
            case 1:
                ((PasteTextInputManagerInterface) this.mViewManager).setPlaceholderTextColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                break;
            case 2:
                ((PasteTextInputManagerInterface) this.mViewManager).setSelection(t, (ReadableMap) obj);
                break;
            case 3:
                ((PasteTextInputManagerInterface) this.mViewManager).setCaretHidden(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 4:
                ((PasteTextInputManagerInterface) this.mViewManager).setCursorColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                break;
            case 5:
                ((PasteTextInputManagerInterface) this.mViewManager).setUnderlineColorAndroid(t, ColorPropConverter.getColor(obj, t.getContext()));
                break;
            case 6:
                ((PasteTextInputManagerInterface) this.mViewManager).setTextBreakStrategy(t, (String) obj);
                break;
            case 7:
                ((PasteTextInputManagerInterface) this.mViewManager).setFontStyle(t, obj != null ? (String) obj : null);
                break;
            case '\b':
                ((PasteTextInputManagerInterface) this.mViewManager).setSpellCheck(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '\t':
                ((PasteTextInputManagerInterface) this.mViewManager).setInputAccessoryViewID(t, obj != null ? (String) obj : null);
                break;
            case '\n':
                ((PasteTextInputManagerInterface) this.mViewManager).setAutoCapitalize(t, (String) obj);
                break;
            case 11:
                ((PasteTextInputManagerInterface) this.mViewManager).setNumberOfLines(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case '\f':
                ((PasteTextInputManagerInterface) this.mViewManager).setSmartPunctuation(t, obj != null ? (String) obj : null);
                break;
            case '\r':
                ((PasteTextInputManagerInterface) this.mViewManager).setFontFamily(t, obj != null ? (String) obj : null);
                break;
            case 14:
                ((PasteTextInputManagerInterface) this.mViewManager).setMultiline(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 15:
                ((PasteTextInputManagerInterface) this.mViewManager).setScrollEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 16:
                ((PasteTextInputManagerInterface) this.mViewManager).setTextAlign(t, obj != null ? (String) obj : null);
                break;
            case 17:
                ((PasteTextInputManagerInterface) this.mViewManager).setDisableCopyPaste(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 18:
                ((PasteTextInputManagerInterface) this.mViewManager).setKeyboardAppearance(t, obj != null ? (String) obj : null);
                break;
            case 19:
                ((PasteTextInputManagerInterface) this.mViewManager).setBlurOnSubmit(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 20:
                ((PasteTextInputManagerInterface) this.mViewManager).setMaxLength(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 21:
                ((PasteTextInputManagerInterface) this.mViewManager).setAutoComplete(t, (String) obj);
                break;
            case 22:
                ((PasteTextInputManagerInterface) this.mViewManager).setFontWeight(t, obj != null ? (String) obj : null);
                break;
            case 23:
                ((PasteTextInputManagerInterface) this.mViewManager).setReturnKeyLabel(t, obj != null ? (String) obj : null);
                break;
            case 24:
                ((PasteTextInputManagerInterface) this.mViewManager).setDefaultValue(t, obj != null ? (String) obj : null);
                break;
            case 25:
                ((PasteTextInputManagerInterface) this.mViewManager).setSelectTextOnFocus(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 26:
                ((PasteTextInputManagerInterface) this.mViewManager).setEnablesReturnKeyAutomatically(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 27:
                ((PasteTextInputManagerInterface) this.mViewManager).setLineHeight(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 28:
                ((PasteTextInputManagerInterface) this.mViewManager).setAutoCorrect(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 29:
                ((PasteTextInputManagerInterface) this.mViewManager).setClearButtonMode(t, obj != null ? (String) obj : null);
                break;
            case 30:
                ((PasteTextInputManagerInterface) this.mViewManager).setAllowFontScaling(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 31:
                ((PasteTextInputManagerInterface) this.mViewManager).setClearTextOnFocus(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case ' ':
                ((PasteTextInputManagerInterface) this.mViewManager).setSelectionHandleColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                break;
            case '!':
                ((PasteTextInputManagerInterface) this.mViewManager).setText(t, obj != null ? (String) obj : null);
                break;
            case '\"':
                ((PasteTextInputManagerInterface) this.mViewManager).setColor(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case '#':
                ((PasteTextInputManagerInterface) this.mViewManager).setValue(t, obj != null ? (String) obj : null);
                break;
            case '$':
                ((PasteTextInputManagerInterface) this.mViewManager).setKeyboardType(t, (String) obj);
                break;
            case '%':
                ((PasteTextInputManagerInterface) this.mViewManager).setFontSize(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case '&':
                ((PasteTextInputManagerInterface) this.mViewManager).setPasswordRules(t, obj != null ? (String) obj : null);
                break;
            case '\'':
                ((PasteTextInputManagerInterface) this.mViewManager).setSmartInsertDelete(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '(':
                ((PasteTextInputManagerInterface) this.mViewManager).setDisableFullscreenUI(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case ')':
                ((PasteTextInputManagerInterface) this.mViewManager).setMaxFontSizeMultiplier(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case '*':
                ((PasteTextInputManagerInterface) this.mViewManager).setSecureTextEntry(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '+':
                ((PasteTextInputManagerInterface) this.mViewManager).setTextShadowColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                break;
            case ',':
                ((PasteTextInputManagerInterface) this.mViewManager).setPlaceholder(t, obj != null ? (String) obj : null);
                break;
            case '-':
                ((PasteTextInputManagerInterface) this.mViewManager).setReturnKeyType(t, (String) obj);
                break;
            case '.':
                ((PasteTextInputManagerInterface) this.mViewManager).setTextShadowOffset(t, (ReadableMap) obj);
                break;
            case '/':
                ((PasteTextInputManagerInterface) this.mViewManager).setMostRecentEventCount(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case '0':
                ((PasteTextInputManagerInterface) this.mViewManager).setTextShadowRadius(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case '1':
                ((PasteTextInputManagerInterface) this.mViewManager).setImportantForAutofill(t, obj != null ? (String) obj : null);
                break;
            case '2':
                ((PasteTextInputManagerInterface) this.mViewManager).setInlineImageLeft(t, obj != null ? (String) obj : null);
                break;
            case '3':
                ((PasteTextInputManagerInterface) this.mViewManager).setTextTransform(t, obj != null ? (String) obj : null);
                break;
            case '4':
                ((PasteTextInputManagerInterface) this.mViewManager).setEditable(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '5':
                ((PasteTextInputManagerInterface) this.mViewManager).setAutoFocus(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '6':
                ((PasteTextInputManagerInterface) this.mViewManager).setTextContentType(t, obj != null ? (String) obj : null);
                break;
            case '7':
                ((PasteTextInputManagerInterface) this.mViewManager).setContextMenuHidden(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '8':
                ((PasteTextInputManagerInterface) this.mViewManager).setTextAlignVertical(t, obj != null ? (String) obj : null);
                break;
            case '9':
                ((PasteTextInputManagerInterface) this.mViewManager).setInlineImagePadding(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case ':':
                ((PasteTextInputManagerInterface) this.mViewManager).setShowSoftInputOnFocus(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case ';':
                ((PasteTextInputManagerInterface) this.mViewManager).setIncludeFontPadding(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '<':
                ((PasteTextInputManagerInterface) this.mViewManager).setTextDecorationLine(t, obj != null ? (String) obj : null);
                break;
            case '=':
                ((PasteTextInputManagerInterface) this.mViewManager).setLetterSpacing(t, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case '>':
                ((PasteTextInputManagerInterface) this.mViewManager).setSelectionColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                break;
            default:
                super.kotlinCompat$setProperty(t, str, obj);
                break;
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: receiveCommand */
    public void kotlinCompat$receiveCommand(T t, String str, ReadableArray readableArray) {
        str.hashCode();
        switch (str) {
            case "blur":
                ((PasteTextInputManagerInterface) this.mViewManager).blur(t);
                break;
            case "focus":
                ((PasteTextInputManagerInterface) this.mViewManager).focus(t);
                break;
            case "setTextAndSelection":
                ((PasteTextInputManagerInterface) this.mViewManager).setTextAndSelection(t, readableArray.getInt(0), readableArray.getString(1), readableArray.getInt(2), readableArray.getInt(3));
                break;
        }
    }
}
