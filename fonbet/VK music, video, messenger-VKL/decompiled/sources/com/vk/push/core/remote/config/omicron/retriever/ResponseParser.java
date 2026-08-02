package com.vk.push.core.remote.config.omicron.retriever;

import androidx.annotation.NonNull;
import com.vk.push.core.remote.config.omicron.Data;
import com.vk.push.core.remote.config.omicron.ParseException;

/* loaded from: classes.dex */
public interface ResponseParser {
    @NonNull
    Data parse(@NonNull String str) throws ParseException;
}
