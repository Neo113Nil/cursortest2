package com.swmansion.enriched.markdown.parser;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarkdownASTNode.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001!B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u0005J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\tHÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Lcom/swmansion/enriched/markdown/parser/MarkdownASTNode;", "", "type", "Lcom/swmansion/enriched/markdown/parser/MarkdownASTNode$NodeType;", "content", "", "attributes", "", ViewHierarchyNode.JsonKeys.CHILDREN, "", "<init>", "(Lcom/swmansion/enriched/markdown/parser/MarkdownASTNode$NodeType;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "getType", "()Lcom/swmansion/enriched/markdown/parser/MarkdownASTNode$NodeType;", "getContent", "()Ljava/lang/String;", "getAttributes", "()Ljava/util/Map;", "getChildren", "()Ljava/util/List;", "getAttribute", SDKConstants.PARAM_KEY, "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "NodeType", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MarkdownASTNode {
    private final Map<String, String> attributes;
    private final List<MarkdownASTNode> children;
    private final String content;
    private final NodeType type;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarkdownASTNode copy$default(MarkdownASTNode markdownASTNode, NodeType nodeType, String str, Map map, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            nodeType = markdownASTNode.type;
        }
        if ((i & 2) != 0) {
            str = markdownASTNode.content;
        }
        if ((i & 4) != 0) {
            map = markdownASTNode.attributes;
        }
        if ((i & 8) != 0) {
            list = markdownASTNode.children;
        }
        return markdownASTNode.copy(nodeType, str, map, list);
    }

    /* renamed from: component1, reason: from getter */
    public final NodeType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    public final Map<String, String> component3() {
        return this.attributes;
    }

    public final List<MarkdownASTNode> component4() {
        return this.children;
    }

    public final MarkdownASTNode copy(NodeType type, String content, Map<String, String> attributes, List<MarkdownASTNode> children) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(children, "children");
        return new MarkdownASTNode(type, content, attributes, children);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarkdownASTNode)) {
            return false;
        }
        MarkdownASTNode markdownASTNode = (MarkdownASTNode) other;
        return this.type == markdownASTNode.type && Intrinsics.areEqual(this.content, markdownASTNode.content) && Intrinsics.areEqual(this.attributes, markdownASTNode.attributes) && Intrinsics.areEqual(this.children, markdownASTNode.children);
    }

    public int hashCode() {
        return (((((this.type.hashCode() * 31) + this.content.hashCode()) * 31) + this.attributes.hashCode()) * 31) + this.children.hashCode();
    }

    public String toString() {
        return "MarkdownASTNode(type=" + this.type + ", content=" + this.content + ", attributes=" + this.attributes + ", children=" + this.children + ")";
    }

    public MarkdownASTNode(NodeType type, String content, Map<String, String> attributes, List<MarkdownASTNode> children) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(children, "children");
        this.type = type;
        this.content = content;
        this.attributes = attributes;
        this.children = children;
    }

    public final NodeType getType() {
        return this.type;
    }

    public /* synthetic */ MarkdownASTNode(NodeType nodeType, String str, Map map, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nodeType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? MapsKt.emptyMap() : map, (i & 8) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final String getContent() {
        return this.content;
    }

    public final Map<String, String> getAttributes() {
        return this.attributes;
    }

    public final List<MarkdownASTNode> getChildren() {
        return this.children;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarkdownASTNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/swmansion/enriched/markdown/parser/MarkdownASTNode$NodeType;", "", "<init>", "(Ljava/lang/String;I)V", "Document", "Paragraph", "Text", "Link", "Heading", "LineBreak", "Strong", "Emphasis", "Code", "Image", "Blockquote", "UnorderedList", "OrderedList", "ListItem", "CodeBlock", "ThematicBreak", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NodeType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ NodeType[] $VALUES;
        public static final NodeType Document = new NodeType("Document", 0);
        public static final NodeType Paragraph = new NodeType("Paragraph", 1);
        public static final NodeType Text = new NodeType("Text", 2);
        public static final NodeType Link = new NodeType("Link", 3);
        public static final NodeType Heading = new NodeType("Heading", 4);
        public static final NodeType LineBreak = new NodeType("LineBreak", 5);
        public static final NodeType Strong = new NodeType("Strong", 6);
        public static final NodeType Emphasis = new NodeType("Emphasis", 7);
        public static final NodeType Code = new NodeType("Code", 8);
        public static final NodeType Image = new NodeType("Image", 9);
        public static final NodeType Blockquote = new NodeType("Blockquote", 10);
        public static final NodeType UnorderedList = new NodeType("UnorderedList", 11);
        public static final NodeType OrderedList = new NodeType("OrderedList", 12);
        public static final NodeType ListItem = new NodeType("ListItem", 13);
        public static final NodeType CodeBlock = new NodeType("CodeBlock", 14);
        public static final NodeType ThematicBreak = new NodeType("ThematicBreak", 15);

        private static final /* synthetic */ NodeType[] $values() {
            return new NodeType[]{Document, Paragraph, Text, Link, Heading, LineBreak, Strong, Emphasis, Code, Image, Blockquote, UnorderedList, OrderedList, ListItem, CodeBlock, ThematicBreak};
        }

        public static EnumEntries<NodeType> getEntries() {
            return $ENTRIES;
        }

        private NodeType(String str, int i) {
        }

        static {
            NodeType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static NodeType valueOf(String str) {
            return (NodeType) Enum.valueOf(NodeType.class, str);
        }

        public static NodeType[] values() {
            return (NodeType[]) $VALUES.clone();
        }
    }

    public final String getAttribute(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.attributes.get(key);
    }
}
