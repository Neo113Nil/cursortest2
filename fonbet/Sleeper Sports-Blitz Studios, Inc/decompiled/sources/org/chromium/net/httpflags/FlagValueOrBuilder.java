package org.chromium.net.httpflags;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;
import org.chromium.net.httpflags.FlagValue;

/* loaded from: classes10.dex */
public interface FlagValueOrBuilder extends MessageLiteOrBuilder {
    FlagValue.ConstrainedValue getConstrainedValues(int index);

    int getConstrainedValuesCount();

    List<FlagValue.ConstrainedValue> getConstrainedValuesList();
}
