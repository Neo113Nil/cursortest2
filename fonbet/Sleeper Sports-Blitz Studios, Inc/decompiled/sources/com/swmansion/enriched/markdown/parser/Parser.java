package com.swmansion.enriched.markdown.parser;

import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Parser.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\t"}, d2 = {"Lcom/swmansion/enriched/markdown/parser/Parser;", "", "<init>", "()V", "parseMarkdown", "Lcom/swmansion/enriched/markdown/parser/MarkdownASTNode;", "markdown", "", "Companion", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Parser {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Parser shared;

    /* JADX INFO: Access modifiers changed from: private */
    @JvmStatic
    public static final native MarkdownASTNode nativeParseMarkdown(String str);

    /* compiled from: Parser.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0083 R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/swmansion/enriched/markdown/parser/Parser$Companion;", "", "<init>", "()V", "nativeParseMarkdown", "Lcom/swmansion/enriched/markdown/parser/MarkdownASTNode;", "markdown", "", "shared", "Lcom/swmansion/enriched/markdown/parser/Parser;", "getShared", "()Lcom/swmansion/enriched/markdown/parser/Parser;", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final MarkdownASTNode nativeParseMarkdown(String markdown) {
            return Parser.nativeParseMarkdown(markdown);
        }

        private Companion() {
        }

        public final Parser getShared() {
            return Parser.shared;
        }
    }

    static {
        try {
            System.loadLibrary("react_codegen_EnrichedMarkdownTextSpec");
        } catch (UnsatisfiedLinkError e) {
            Log.e("MarkdownParser", "Failed to load native library", e);
        }
        shared = new Parser();
    }

    public final MarkdownASTNode parseMarkdown(String markdown) {
        Intrinsics.checkNotNullParameter(markdown, "markdown");
        if (StringsKt.isBlank(markdown)) {
            return null;
        }
        try {
            MarkdownASTNode nativeParseMarkdown = INSTANCE.nativeParseMarkdown(markdown);
            if (nativeParseMarkdown != null) {
                return nativeParseMarkdown;
            }
            Log.w("MarkdownParser", "Native parser returned null");
            return null;
        } catch (Exception e) {
            Log.e("MarkdownParser", "MD4C parsing failed: " + e.getMessage(), e);
            return null;
        }
    }
}
