package androidx.compose.foundation.text2.input.internal.undo;

import androidx.compose.foundation.text2.input.TextFieldCharSequence;
import androidx.compose.foundation.text2.input.TextFieldCharSequenceKt;
import androidx.compose.foundation.text2.input.TextFieldState;
import androidx.compose.foundation.text2.input.internal.EditingBuffer;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;

/* compiled from: TextUndoOperation.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0006"}, d2 = {"redo", "", "Landroidx/compose/foundation/text2/input/TextFieldState;", "op", "Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;", "undo", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TextUndoOperationKt {
    public static final void undo(TextFieldState textFieldState, TextUndoOperation textUndoOperation) {
        TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer = textFieldState.getMainBuffer();
        mainBuffer.replace(textUndoOperation.getIndex(), textUndoOperation.getIndex() + textUndoOperation.getPostText().length(), textUndoOperation.getPreText());
        mainBuffer.setSelection(TextRange.m3939getStartimpl(textUndoOperation.getPreSelection()), TextRange.m3934getEndimpl(textUndoOperation.getPreSelection()));
        TextFieldCharSequence m1110TextFieldCharSequence3r_uNRQ = TextFieldCharSequenceKt.m1110TextFieldCharSequence3r_uNRQ(textFieldState.getMainBuffer().toString(), textFieldState.getMainBuffer().m1129getSelectiond9O1mEE(), textFieldState.getMainBuffer().m1128getCompositionMzsxiRA());
        textFieldState.setText(m1110TextFieldCharSequence3r_uNRQ);
        textFieldState.notifyIme(text, m1110TextFieldCharSequence3r_uNRQ);
    }

    public static final void redo(TextFieldState textFieldState, TextUndoOperation textUndoOperation) {
        TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer = textFieldState.getMainBuffer();
        mainBuffer.replace(textUndoOperation.getIndex(), textUndoOperation.getIndex() + textUndoOperation.getPreText().length(), textUndoOperation.getPostText());
        mainBuffer.setSelection(TextRange.m3939getStartimpl(textUndoOperation.getPostSelection()), TextRange.m3934getEndimpl(textUndoOperation.getPostSelection()));
        TextFieldCharSequence m1110TextFieldCharSequence3r_uNRQ = TextFieldCharSequenceKt.m1110TextFieldCharSequence3r_uNRQ(textFieldState.getMainBuffer().toString(), textFieldState.getMainBuffer().m1129getSelectiond9O1mEE(), textFieldState.getMainBuffer().m1128getCompositionMzsxiRA());
        textFieldState.setText(m1110TextFieldCharSequence3r_uNRQ);
        textFieldState.notifyIme(text, m1110TextFieldCharSequence3r_uNRQ);
    }
}
