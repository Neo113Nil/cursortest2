package androidx.compose.foundation.text2.input.internal;

import android.view.inputmethod.EditorInfo;
import androidx.compose.foundation.text2.input.TextFieldCharSequence;
import androidx.compose.ui.platform.PlatformTextInputSession;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: AndroidTextInputSession.android.kt */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002\u001a \u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0002\u001a8\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0017H\u0080@¢\u0006\u0002\u0010\u0019\u001a\u001c\u0010\u001a\u001a\u00020\u000b*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0004\u0010\u0005¨\u0006\u001e"}, d2 = {"TAG", "", "TIA_DEBUG", "", "getTIA_DEBUG$annotations", "()V", "hasFlag", "bits", "", "flag", "logDebug", "", "tag", "content", "Lkotlin/Function0;", "platformSpecificTextInputSession", "", "Landroidx/compose/ui/platform/PlatformTextInputSession;", "state", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "onImeAction", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/ImeAction;", "(Landroidx/compose/ui/platform/PlatformTextInputSession;Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/input/ImeOptions;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "Landroid/view/inputmethod/EditorInfo;", "textFieldValue", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidTextInputSession_androidKt {
    private static final String TAG = "AndroidTextInputSession";
    public static final boolean TIA_DEBUG = false;

    public static /* synthetic */ void getTIA_DEBUG$annotations() {
    }

    private static final boolean hasFlag(int i, int i2) {
        return (i & i2) == i2;
    }

    private static final void logDebug(String str, Function0<String> function0) {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object platformSpecificTextInputSession(PlatformTextInputSession platformTextInputSession, TransformedTextFieldState transformedTextFieldState, ImeOptions imeOptions, Function1<? super ImeAction, Unit> function1, Continuation<?> continuation) {
        AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 androidTextInputSession_androidKt$platformSpecificTextInputSession$1;
        int i;
        if (continuation instanceof AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1) {
            androidTextInputSession_androidKt$platformSpecificTextInputSession$1 = (AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1) continuation;
            if ((androidTextInputSession_androidKt$platformSpecificTextInputSession$1.label & Integer.MIN_VALUE) != 0) {
                androidTextInputSession_androidKt$platformSpecificTextInputSession$1.label -= Integer.MIN_VALUE;
                Object obj = androidTextInputSession_androidKt$platformSpecificTextInputSession$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidTextInputSession_androidKt$platformSpecificTextInputSession$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 androidTextInputSession_androidKt$platformSpecificTextInputSession$2 = new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2(platformTextInputSession, transformedTextFieldState, ComposeInputMethodManager_androidKt.ComposeInputMethodManager(platformTextInputSession.getView()), imeOptions, function1, null);
                    androidTextInputSession_androidKt$platformSpecificTextInputSession$1.label = 1;
                    if (CoroutineScopeKt.coroutineScope(androidTextInputSession_androidKt$platformSpecificTextInputSession$2, androidTextInputSession_androidKt$platformSpecificTextInputSession$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }
        androidTextInputSession_androidKt$platformSpecificTextInputSession$1 = new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1(continuation);
        Object obj2 = androidTextInputSession_androidKt$platformSpecificTextInputSession$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidTextInputSession_androidKt$platformSpecificTextInputSession$1.label;
        if (i != 0) {
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void update(EditorInfo editorInfo, TextFieldCharSequence textFieldCharSequence, ImeOptions imeOptions) {
        int imeAction = imeOptions.getImeAction();
        int i = 3;
        int i2 = 6;
        if (ImeAction.m4103equalsimpl0(imeAction, ImeAction.INSTANCE.m4115getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i2 = 0;
            }
        } else if (ImeAction.m4103equalsimpl0(imeAction, ImeAction.INSTANCE.m4119getNoneeUduSuo())) {
            i2 = 1;
        } else if (ImeAction.m4103equalsimpl0(imeAction, ImeAction.INSTANCE.m4117getGoeUduSuo())) {
            i2 = 2;
        } else if (ImeAction.m4103equalsimpl0(imeAction, ImeAction.INSTANCE.m4118getNexteUduSuo())) {
            i2 = 5;
        } else if (ImeAction.m4103equalsimpl0(imeAction, ImeAction.INSTANCE.m4120getPreviouseUduSuo())) {
            i2 = 7;
        } else if (ImeAction.m4103equalsimpl0(imeAction, ImeAction.INSTANCE.m4121getSearcheUduSuo())) {
            i2 = 3;
        } else if (ImeAction.m4103equalsimpl0(imeAction, ImeAction.INSTANCE.m4122getSendeUduSuo())) {
            i2 = 4;
        } else if (!ImeAction.m4103equalsimpl0(imeAction, ImeAction.INSTANCE.m4116getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction".toString());
        }
        editorInfo.imeOptions = i2;
        int keyboardType = imeOptions.getKeyboardType();
        if (!KeyboardType.m4150equalsimpl0(keyboardType, KeyboardType.INSTANCE.m4170getTextPjHm6EE())) {
            if (KeyboardType.m4150equalsimpl0(keyboardType, KeyboardType.INSTANCE.m4163getAsciiPjHm6EE())) {
                editorInfo.imeOptions |= Integer.MIN_VALUE;
            } else {
                if (KeyboardType.m4150equalsimpl0(keyboardType, KeyboardType.INSTANCE.m4166getNumberPjHm6EE())) {
                    i = 2;
                } else if (!KeyboardType.m4150equalsimpl0(keyboardType, KeyboardType.INSTANCE.m4169getPhonePjHm6EE())) {
                    if (KeyboardType.m4150equalsimpl0(keyboardType, KeyboardType.INSTANCE.m4171getUriPjHm6EE())) {
                        i = 17;
                    } else if (KeyboardType.m4150equalsimpl0(keyboardType, KeyboardType.INSTANCE.m4165getEmailPjHm6EE())) {
                        i = 33;
                    } else if (KeyboardType.m4150equalsimpl0(keyboardType, KeyboardType.INSTANCE.m4168getPasswordPjHm6EE())) {
                        i = 129;
                    } else if (KeyboardType.m4150equalsimpl0(keyboardType, KeyboardType.INSTANCE.m4167getNumberPasswordPjHm6EE())) {
                        i = 18;
                    } else {
                        if (!KeyboardType.m4150equalsimpl0(keyboardType, KeyboardType.INSTANCE.m4164getDecimalPjHm6EE())) {
                            throw new IllegalStateException("Invalid Keyboard Type".toString());
                        }
                        i = 8194;
                    }
                }
                editorInfo.inputType = i;
                if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
                    editorInfo.inputType |= 131072;
                    if (ImeAction.m4103equalsimpl0(imeOptions.getImeAction(), ImeAction.INSTANCE.m4115getDefaulteUduSuo())) {
                        editorInfo.imeOptions |= 1073741824;
                    }
                }
                if (hasFlag(editorInfo.inputType, 1)) {
                    int capitalization = imeOptions.getCapitalization();
                    if (KeyboardCapitalization.m4135equalsimpl0(capitalization, KeyboardCapitalization.INSTANCE.m4143getCharactersIUNYP9k())) {
                        editorInfo.inputType |= 4096;
                    } else if (KeyboardCapitalization.m4135equalsimpl0(capitalization, KeyboardCapitalization.INSTANCE.m4146getWordsIUNYP9k())) {
                        editorInfo.inputType |= 8192;
                    } else if (KeyboardCapitalization.m4135equalsimpl0(capitalization, KeyboardCapitalization.INSTANCE.m4145getSentencesIUNYP9k())) {
                        editorInfo.inputType |= 16384;
                    }
                    if (imeOptions.getAutoCorrect()) {
                        editorInfo.inputType |= 32768;
                    }
                }
                editorInfo.initialSelStart = TextRange.m3939getStartimpl(textFieldCharSequence.getSelectionInChars());
                editorInfo.initialSelEnd = TextRange.m3934getEndimpl(textFieldCharSequence.getSelectionInChars());
                EditorInfoCompat.setInitialSurroundingText(editorInfo, textFieldCharSequence);
                editorInfo.imeOptions |= 33554432;
            }
        }
        i = 1;
        editorInfo.inputType = i;
        if (!imeOptions.getSingleLine()) {
            editorInfo.inputType |= 131072;
            if (ImeAction.m4103equalsimpl0(imeOptions.getImeAction(), ImeAction.INSTANCE.m4115getDefaulteUduSuo())) {
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
        }
        editorInfo.initialSelStart = TextRange.m3939getStartimpl(textFieldCharSequence.getSelectionInChars());
        editorInfo.initialSelEnd = TextRange.m3934getEndimpl(textFieldCharSequence.getSelectionInChars());
        EditorInfoCompat.setInitialSurroundingText(editorInfo, textFieldCharSequence);
        editorInfo.imeOptions |= 33554432;
    }

    static /* synthetic */ void logDebug$default(String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = TAG;
        }
        logDebug(str, function0);
    }
}
